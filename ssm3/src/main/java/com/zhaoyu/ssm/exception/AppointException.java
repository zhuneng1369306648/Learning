package com.zhaoyu.ssm.exception;
//  预约未知错误异常
public class AppointException extends RuntimeException{
	
	public AppointException(String message) {
		super(message);
	}
	
	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

}
