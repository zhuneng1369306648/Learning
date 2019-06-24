package com.zhaoyu.javaBean;

public class Box {
	double length;
	double width;
	double height;
	public Box() {
		length = 0;
		width = 0;
		height = 0;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double volum() {
		return length*height*width;
	}
	public double surfaceArea() {
		return length *width*2 + length*height*2 + width*height*2;
	}
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	

}
