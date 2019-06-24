package com.zy.store.web.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.zy.store.domain.Category;
import com.zy.store.domain.PageModel;
import com.zy.store.domain.Product;
import com.zy.store.service.CategoryService;
import com.zy.store.service.ProductService;
import com.zy.store.service.serviceImp.CategoryServiceImp;
import com.zy.store.service.serviceImp.ProductServiceImp;
import com.zy.store.utils.UUIDUtils;
import com.zy.store.utils.UploadUtils;
import com.zy.store.web.base.BaseServlet;

public class AdminProductServlet extends BaseServlet {
	//findAllProductsWithPage
		public String findAllProductsWithPage(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取当前页
			int curNum=Integer.parseInt(req.getParameter("num"));
			//调用业务层查全部商品信息返回PageModel
			ProductService ProductService=new ProductServiceImp();
			PageModel pm=ProductService.findAllProductsWithPage(curNum);
			//将PageModel放入request
			req.setAttribute("page", pm);
			//转发到/admin/product/list.jsp
			return "/admin/product/list.jsp";
		}
		
		//addProductUI
		public String addProductUI(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			CategoryService CategoryService=new CategoryServiceImp();
			//获取全部分类信息
			List<Category> list = CategoryService.getAllCats();
			//将全部分类信息放入request
			req.setAttribute("allCats", list);
			//转发到/admin/product/add.jsp
			return "/admin/product/add.jsp";
		}
		
		//addProduct
		public String addProduct(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//存储表单中数据
			Map<String,String> map=new HashMap<String,String>();
			//携带表中的数据向service,dao
			Product product=new Product();
			try{
				//利用req.getinputStream 获取到请求体重全部数据，进行才分分封装
				DiskFileItemFactory fac=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(fac);
				List<FileItem> list=upload.parseRequest(req);
				for(FileItem item : list) {
					if(item.isFormField()) {
						//5_如果当前的FileItem对象是普通项
						//将普通项上name属性的值作为键,将获取到的内容作为值,放入MAP中
						// {username<==>tom,password<==>1234}
						
						/*
						判断某项是否是普通的表单类型。
						例如：在上传文件时用到
						List list = upload.parseRequest(request);
						for(FileItem item : list){
						if(item.isFormField()){
						。。。。//判断该表单项是否是普通类型
						}else{
						。。。。 //否则该表单项是file 类型的
						}
						}*/
						map.put(item.getFieldName(), item.getString("utf-8"));
					}else {
						//6_如果当前的FileItem对象是上传项
						
						//获取到原始的文件名称
						String oldFileName=item.getName();
						//获取到要保存文件的名称   1222.doc  123421342143214.doc
						String newFileName=UploadUtils.getUUIDName(oldFileName);
						
						//通过FileItem获取到输入流对象,通过输入流可以获取到图片二进制数据
						InputStream is=item.getInputStream();
						//获取到当前项目下products/3下的真实路径
						//D:\tomcat\tomcat71_sz07\webapps\store_v5\products\3
						String realPath=getServletContext().getRealPath("/products/3/");
						String dir=UploadUtils.getDir(newFileName); // /f/e/d/c/4/9/8/4
						String path=realPath+dir; //D:\tomcat\tomcat71_sz07\webapps\store_v5\products\3/f/e/d/c/4/9/8/4
						//内存中声明一个目录
						File newDir=new File(path);
						if(!newDir.exists()){
							newDir.mkdirs();
						}
						//在服务端创建一个空文件(后缀必须和上传到服务端的文件名后缀一致)
						File finalFile=new File(newDir,newFileName);
						if(!finalFile.exists()){
							finalFile.createNewFile();
						}
						//建立和空文件对应的输出流
						OutputStream os=new FileOutputStream(finalFile);
						//将输入流中的数据刷到输出流中
						IOUtils.copy(is, os);
						//释放资源
						IOUtils.closeQuietly(is);
						IOUtils.closeQuietly(os);
						//向map中存入一个键值对的数据 userhead<===> /image/11.bmp
						// {username<==>tom,password<==>1234,userhead<===>image/11.bmp}
						map.put("pimage", "/products/3/"+dir+"/"+newFileName);
						
					}
				}
				//7_利用BeanUtils将MAP中的数据填充到Product对象上
				BeanUtils.populate(product, map);
				product.setPid(UUIDUtils.getId());
				product.setPdate(new Date());
				product.setPflag(0);
				
				//8_调用servcie_dao将user上携带的数据存入数据仓库,重定向到查询全部商品信息路径
				ProductService ProductService=new ProductServiceImp();
				ProductService.saveProduct(product);
				
				resp.sendRedirect("/store_v5/AdminProductServlet?method=findAllProductsWithPage&num=1");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			return null;
			
			
		
		}
		

}
