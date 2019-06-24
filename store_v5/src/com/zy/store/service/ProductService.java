package com.zy.store.service;

import java.util.List;

import com.zy.store.domain.PageModel;
import com.zy.store.domain.Product;

public interface ProductService {
	
	List<Product> findHots() throws Exception;
	
	List<Product> findNews() throws Exception;

	Product findProductByPid(String pid)throws Exception;

	PageModel findProductsByCidWithPage(String cid, int curNum)throws Exception;
	
	PageModel findAllProductsWithPage(int curNum)throws Exception;
	
	void saveProduct(Product product)throws Exception;

}
