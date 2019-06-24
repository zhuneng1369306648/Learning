package com.zy.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String fileName = request.getParameter("filename");	
	        String path = getServletContext().getRealPath("download/"+fileName);
	        response.setHeader("Content-Disposition", "attachment; filename"+fileName);
	       // response.sendRedirect("login_success.html");
	        InputStream is = new FileInputStream(path);
	        OutputStream os = response.getOutputStream();
	        int len = 0;
	        byte []buffer = new byte[1024];
	        while((len = is.read(buffer)) != -1) {
	        	os.write(buffer,0,len);
	        }
	    	os.close();
			is.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
