package com.zy.store.service.serviceImp;

import java.util.List;

import com.zy.store.dao.ProductDao;
import com.zy.store.domain.PageModel;
import com.zy.store.domain.Product;
import com.zy.store.service.ProductService;
import com.zy.store.utils.BeanFactory;

public class ProductServiceImp implements ProductService{

	ProductDao ProductDao=(ProductDao)BeanFactory.createObject("ProductDao");
	
	@Override
	public void saveProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		ProductDao.saveProduct(product);
		
	}
	
	@Override
	public Product findProductByPid(String pid) throws Exception {
		// TODO Auto-generated method stub
		return ProductDao.findProductByPid(pid);
	}

	@Override
	public List<Product> findHots() throws Exception {
		// TODO Auto-generated method stub
		return ProductDao.findHots();
	}

	@Override
	public List<Product> findNews() throws Exception {
		// TODO Auto-generated method stub
		return ProductDao.findNews();
	}

	@Override
	public PageModel findProductsByCidWithPage(String cid, int curNum) throws Exception {
		// TODO Auto-generated method stub
		//创建pagemodel对象，目的：计算分页参数
		//统计当前分类下的商品个数  select (*) from product where cid=?
		int totalRecords=ProductDao.findTotalRecords(cid);
		PageModel pm = new PageModel(curNum,totalRecords,12);
		//关联集合 select * from product where cid = ? limit ?,?
		List list = ProductDao.findProductsByCidWithPage(cid,pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		pm.setUrl("ProductServlet?method=findProductByCidWithPage&cid="+cid);
		return pm;
	}

	@Override
	public PageModel findAllProductsWithPage(int curNum) throws Exception {
		// TODO Auto-generated method stub
		int totalRecords=ProductDao.findTotalRecords(null);
		PageModel pm=new PageModel(curNum,totalRecords,5);
		List<Product> list=ProductDao.findAllProductsWithPage(pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		return pm;
	}

}
