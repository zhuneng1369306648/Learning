package com.zy.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zy.spring.pojo.Item;
import com.zy.spring.pojo.QueryVo;
import com.zy.spring.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("itemList")
	public ModelAndView itemList() {
		ModelAndView mav = new ModelAndView();
		List<Item> itemList = itemService.getItemList();
		mav.addObject("itemList",itemList);
		mav.setViewName("itemList");
		return mav;
		
	}
	@RequestMapping("itemEdit")
	public String itemEdit(Model model,@RequestParam(value="id",required=true,defaultValue="1") Integer ids){
		Item item = itemService.getItemById(ids);
		model.addAttribute("item",item);
		return "itemEdit";
				
	}
	/**
	 * 修改商品
	 * 演示pojo参数绑定
	 * @param item
	 * @return
	 */
	@RequestMapping("updateItem")
	public String updateItem(Item item,Model model){
		itemService.updateItem(item);
		model.addAttribute("item", item);
		model.addAttribute("msg", "修改商品信息成功");
		return "itemEdit";
	}
	
	@RequestMapping("queryItem")
	public String queryItem(QueryVo vo,Model model){
		if(vo.getItem() != null){
			System.out.println(vo.getItem());
		}
		
		//模拟搜索商品
		List<Item> itemList = itemService.getItemList();

		model.addAttribute("itemList", itemList);
		return "itemList";
	}

}
