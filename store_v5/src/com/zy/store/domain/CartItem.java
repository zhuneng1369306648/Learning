package com.zy.store.domain;

public class CartItem {
	private Product product;//目的携带购物项三种参数（图片路劲，商品名称，商品价格）
	private int num;
	private double subTotal;
	
	public double getSubTotal() {
		return product.getShop_price()*num;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

}
