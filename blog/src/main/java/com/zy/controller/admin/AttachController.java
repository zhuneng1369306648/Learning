package com.zy.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.zy.controller.BaseController;
import com.zy.controller.admin.AttachController;
import com.zy.api.QiNiuCloudService;
import com.zy.constant.ErrorConstant;
import com.zy.constant.LogActions;
import com.zy.exception.BusinessException;
import com.zy.model.AttAchDomain;
import com.zy.model.UserDomain;
import com.zy.utils.APIResponse;
import com.zy.constant.Types;
import com.zy.constant.WebConst;
import com.zy.utils.Commons;
import com.zy.dto.AttAchDto;
import com.zy.service.attach.AttAchService;
import com.zy.service.log.LogService;
import com.zy.utils.TaleUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("文件管理")
@Controller
@RequestMapping("admin/attach")
public class AttachController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AttachController.class);

    public static final String CLASSPATH = TaleUtils.getUploadFilePath();

    @Autowired
    private AttAchService attAchService;

    @Autowired
    private LogService logService;



    @ApiOperation("文件管理首页")
    @GetMapping(value = "")
    public String index(
            HttpServletRequest request,
            @ApiParam(name = "page", value = "页数", required = false)
            @RequestParam(name = "page", required = false, defaultValue = "1")
            int page,
            @ApiParam(name = "limit", value = "条数", required = false)
            @RequestParam(name = "limit", required = false, defaultValue = "12")
            int limit
    ) {
        PageInfo<AttAchDto> atts = attAchService.getAtts(page, limit);
        request.setAttribute("attachs", atts);
        request.setAttribute(Types.ATTACH_URL.getType(),Commons.site_option(Types.ATTACH_URL.getType(), Commons.site_url()));
        request.setAttribute("max_file_size", WebConst.MAX_FILE_SIZE / 1024);
        return "admin/attach";
    }

    @ApiOperation("markdown文件上传")
    @PostMapping(value = "/uploadfile")
    public void fileUploadToTencentCloud(
            HttpServletRequest request,
            HttpServletResponse response,
            @ApiParam(name = "editormd-image-file", value = "文件数组", required = true)
            @RequestParam(name = "editormd-image-file", required = true)
            MultipartFile file
    ) {

    }


    @ApiOperation("多文件上传")
    @PostMapping(value = "upload")
    @ResponseBody
    public APIResponse filesUploadToCloud(
            HttpServletRequest request,
            HttpServletResponse response,
            @ApiParam(name = "file", value = "文件数组", required = true)
            @RequestParam(name = "file", required = true)
            MultipartFile[] files
    ) {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Type","text/html");

            for (MultipartFile file :files) {

                String fileName = TaleUtils.getFileKey(file.getOriginalFilename().replaceFirst("/", ""));

                QiNiuCloudService.upload(file, fileName);
                AttAchDomain attAchDomain = new AttAchDomain();
                HttpSession session = request.getSession();
                UserDomain sessionUser = (UserDomain) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
                attAchDomain.setAuthorId(sessionUser.getUid());
                attAchDomain.setFtype(TaleUtils.isImage(file.getInputStream()) ? Types.IMAGE.getType() : Types.FILE.getType());
                attAchDomain.setFname(fileName);
                attAchDomain.setFkey(QiNiuCloudService.QINIU_UPLOAD_SITE + fileName);
                attAchService.addAttAch(attAchDomain);
            }
            return APIResponse.success();

        } catch (IOException e) {
            e.printStackTrace();
            throw BusinessException.withErrorCode(ErrorConstant.Att.ADD_NEW_ATT_FAIL)
                    .withErrorMessageArguments(e.getMessage());
        }

    }

    @ApiOperation("删除文件")
    @PostMapping(value = "/delete")
    @ResponseBody
    public APIResponse deleteFileInfo(
            HttpServletRequest request,
            @ApiParam(name = "id", value = "文件主键", required = true)
            @RequestParam(name = "id", required = true)
            Integer id
    ) {
        try {
            AttAchDto attach = attAchService.getAttAchById(id);
            if (null == attach)
                throw BusinessException.withErrorCode(ErrorConstant.Att.DELETE_ATT_FAIL + ": 文件不存在");
            attAchService.deleteAttAch(id);
            // 写入日志
            logService.addLog(LogActions.DEL_ATTACH.getAction(),this.user(request).getUsername()+"用户",request.getRemoteAddr(),this.getUid(request));
            return APIResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            throw BusinessException.withErrorCode(e.getMessage());
        }
    }

}
