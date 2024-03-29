package com.zy.store.dao;

import java.util.List;

import com.zy.store.domain.Product;

public interface ProductDao {
	List<Product> findHots()throws Exception;

	List<Product> findNews()throws Exception;

	Product findProductByPid(String pid)throws Exception;

	int findTotalRecords(String cid)throws Exception;

	List findProductsByCidWithPage(String cid, int startIndex, int pageSize)throws Exception;

	int findTotalRecords()throws Exception;

	List<Product> findAllProductsWithPage(int startIndex, int pageSize)throws Exception;

	void saveProduct(Product product)throws Exception;

}
