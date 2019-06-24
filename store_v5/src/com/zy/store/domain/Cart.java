package com.zy.store.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.zy.store.domain.CartItem;

public class Cart {

	//总计/积分
	private double total =0;
	Map<String,CartItem> map=new HashMap<String,CartItem>();
	
	//添加购物项到购物车，
	//当用户点击加入购物车按钮，可以将当前要购买的商品id ，商品数量，商品价格添加
	//有了商品信息product对象，有了要购买商品数量，当前的购物项也就可以获取
	public void addCartItemToCar(CartItem cartItem) {
		String pid =cartItem.getProduct().getPid();
		//将当前的购物项加入购物车之前,判断之前是否买过这类商品
				//如果没有买过    list.add(cartItem);
				//如果买过: 获取到原先的数量,获取到本次的数量,相加之后设置到原先购物项上
		if(map.containsKey(pid)) {
			CartItem oldItem=map.get(pid);
			oldItem.setNum(oldItem.getNum()+cartItem.getNum());
		}else {
			map.put(pid, cartItem);
		}
	}
	//返回map中所有的值
	public Collection<CartItem> getCartItem(){
		return map.values();
	}
	
	//移除购物项
	public void removeCartItem(String pid){
		map.remove(pid);
	}
	//清空购物车
	public void clearCart(){
		map.clear();
	}
	
	//总计是可以经过计算获取到
	public double getTotal() {
		//向让总计请0
		total=0;
		//获取到Map中所有的购物项
		Collection<CartItem> values = map.values();
		
		//遍历所有的购物项,将购物项上的小计相加
		for (CartItem cartItem : values) {
			total+=cartItem.getSubTotal();
		}
		
		return total;
	}
	

	public void setTotal(double total) {
		this.total = total;
	}

	public Map<String, CartItem> getMap() {
		return map;
	}


	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}
}
