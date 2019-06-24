package com.zy.spring.service;

import java.util.List;

import com.zy.spring.pojo.Item;

public interface ItemService {

	List<Item> getItemList();

	Item getItemById(Integer ids);

	void updateItem(Item item);

}
