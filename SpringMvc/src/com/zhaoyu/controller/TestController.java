package com.zhaoyu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhaoyu.annotation.Controller;
import com.zhaoyu.annotation.RequestMapping;
import com.zhaoyu.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
 

 
  @RequestMapping("/doTest")
   public void test1(HttpServletRequest request, HttpServletResponse response,
       @RequestParam("param") String param){
    System.out.println(param);
     try {
           response.getWriter().write( "doTest method success! param:"+param);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
  
  
  @RequestMapping("/doTest2")
   public void test2(HttpServletRequest request, HttpServletResponse response){
       try {
           response.getWriter().println("doTest2 method success!");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}