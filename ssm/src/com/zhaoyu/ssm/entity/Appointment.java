package com.zhaoyu.ssm.entity;

import java.util.Date;

public class Appointment {
	
	private long boodId; //图书ID
	private long studentId; //学号
	private Date appointTime; //预约时间
	
	//多对一的复合属性
	private Book book; //图书实体

	public long getBoodId() {
		return boodId;
	}

	public void setBoodId(long boodId) {
		this.boodId = boodId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Appointment [boodId=" + boodId + ", studentId=" + studentId + ", appointTime=" + appointTime + ", book="
				+ book + "]";
	}
	

}
