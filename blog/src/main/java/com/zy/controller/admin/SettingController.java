package com.zy.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy.constant.LogActions;
import com.zy.constant.WebConst;
import com.zy.utils.APIResponse;
import com.zy.utils.GsonUtils;
import com.zy.controller.BaseController;
import com.zy.model.OptionsDomain;
import com.zy.service.log.LogService;
import com.zy.service.option.OptionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("系统设置管理")
@Controller
@RequestMapping("admin/setting")
public class SettingController  extends BaseController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SettingController.class);
	
	@Autowired
	private OptionService optionService;
	
	@Autowired
	private LogService logService;
	
	@ApiOperation("进入设置项")
	@GetMapping(value = "")
	public String index(HttpServletRequest request) {
		List<OptionsDomain> optionsList = optionService.getOptions();
		Map<String, String> options = new HashMap<>();
		optionsList.forEach((option) ->{
			options.put(option.getName(),option.getValue());
		});
		request.setAttribute("options", options);
		return "admin/setting";
	}
	
	@ApiOperation("保存系统设置")
    @PostMapping(value = "")
    @ResponseBody
    public APIResponse saveSetting(HttpServletRequest request) {

        try {
            Map<String, String[]> parameterMap = request.getParameterMap();
            Map<String, String> querys = new HashMap<>();
            parameterMap.forEach((key, value) -> {
            //System.out.println(key + "------" + join(value));
                querys.put(key, join(value));
            });

            optionService.saveOptions(querys);
            WebConst.initConfig = querys;

            // 写入日志
            logService.addLog(LogActions.SYS_SETTING.getAction(),GsonUtils.toJsonString(querys),request.getRemoteAddr(),this.getUid(request));
            return APIResponse.success();

        } catch (Exception e) {
            String msg = "保存设置失败";
            return APIResponse.fail(e.getMessage());
        }
    }


}
