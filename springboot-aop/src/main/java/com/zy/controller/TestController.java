package com.zy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.annotation.Log;

@RestController
public class TestController {
	
	@Log("方法一")
	@GetMapping("/one")
	public void methodOne(String name) {
		
	}
	
	@Log("方法二")
	@GetMapping("/two")
	public void methodTwo() throws InterruptedException{
		Thread.sleep(2000);
	}
	@Log("方法三")
	@GetMapping("/three")
	public void methodThree(String name,String age) {
		
	}

}
