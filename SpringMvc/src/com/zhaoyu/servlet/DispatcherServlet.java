package com.zhaoyu.servlet;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhaoyu.annotation.Controller;
import com.zhaoyu.annotation.Quatifier;
import com.zhaoyu.annotation.RequestMapping;
import com.zhaoyu.annotation.Service;
import com.zhaoyu.controller.SpringmvcController;

@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    List<String> packageNames = new ArrayList<String>();
    //所有类的实例，key是注解的value，value是所有类的实例
    Map<String, Object> instanceMap = new HashMap<String, Object>();
	Map<String, Object> handerMap = new HashMap<String, Object>();
	public DispatcherServlet() {
		super();
	}
	
	public void init(ServletConfig config) throws ServletException {
		//包扫描
		scanPackage("com.zhaoyu");
		try {
			filterAndInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//建立映射关系
		handerMap();
		ioc();
	}

	private void ioc() {
		// TODO Auto-generated method stub
		if(instanceMap.isEmpty())
			return;
		for(Map.Entry<String, Object> entry : instanceMap.entrySet()) {
			Field fields[]  = entry.getValue().getClass().getDeclaredFields();
			for(Field field: fields) {
				field.setAccessible(true);//可访问私有属性
				if (field.isAnnotationPresent(Quatifier.class));
				Quatifier quatifier = field.getAnnotation(Quatifier.class);
				String value = quatifier.value();
				field.setAccessible(true);
				try {
					field.set(entry.getValue(), instanceMap.get(value));
				}catch (IllegalAccessException e) {
					e.printStackTrace();
				}catch (IllegalArgumentException e) {
				    e.printStackTrace();
				}
			}
		}
		
	}

	private void handerMap() {
		if (instanceMap.size() <= 0)
			return;
		for (Map.Entry<String, Object> entry : instanceMap.entrySet()) {
			if (entry.getValue().getClass().isAnnotationPresent(Controller.class)) {
				Controller controller = (Controller) entry.getValue().getClass().getAnnotation(Controller.class);
				String ctvalue = controller.value();
				Method[] methods = entry.getValue().getClass().getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(RequestMapping.class)) {
						RequestMapping rm = (RequestMapping) method.getAnnotation(RequestMapping.class);
						String rmvalue = rm.value();
						handerMap.put("/" + ctvalue + "/" + rmvalue, method);
					} else {
						continue;
					}
				}
			} else {
				continue;
			}
 
		}
	}

	private void filterAndInstance() throws Exception{
		
		if(packageNames.size() <= 0) {
			return;
		}
		for(String className : packageNames) {
			Class<?> cName = Class.forName(className.replace(".class", "").trim());
			if(cName.isAnnotationPresent(Controller.class)) {
			//如果一个注解指定类型是存在于此元素上方法返回true，否则返回false。
			//这种方法主要是为了便于访问标记注释而设计。	
				Object instance = cName.newInstance();
				//实例化对象
				Controller controller = (Controller) cName.getAnnotation(Controller.class);
			    //方法返回这个元素的注解指定类型，如果这样的注释，否则返回null。
				String key = controller.value();
				instanceMap.put(key, instance);
			
			}else if(cName.isAnnotationPresent(Service.class)) {
				Object instance = cName.newInstance();
				Service service = (Service) cName.getAnnotation(Service.class);
				String key = service.value();
				instanceMap.put(key, instance);
			}else {
				continue;
			}
			
			
			
			
		}
		
		
	}

	private void scanPackage(String Package) {
		// TODO Auto-generated method stub
		URL url = this.getClass().getClassLoader().getResource("/" + replaceTo(Package));// 将所有的.转义获取对应的路径
		String pathFile = url.getFile();
		File file = new File(pathFile);
		String fileList[] = file.list();
		for(String path : fileList) {
			File eachFile = new File(pathFile + path);
			if(eachFile.isDirectory()) {
				scanPackage(Package + eachFile.getName());
			}else {
				packageNames.add(Package + "." + eachFile.getName());
			}
		}
	}

	private String replaceTo(String path) {
		return path.replaceAll("\\.", "/");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		String context = req.getContextPath();
		String path = url.replace(context, "");
		Method method = (Method) handerMap.get(path);
		SpringmvcController controller = (SpringmvcController) instanceMap.get(path.split("/")[1]);
		try {
			method.invoke(controller, new Object[] { req, resp, null });
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
 
	
}
