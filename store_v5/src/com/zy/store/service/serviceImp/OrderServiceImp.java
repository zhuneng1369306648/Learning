package com.zy.store.service.serviceImp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.zy.store.dao.OrderDao;
import com.zy.store.dao.daoImp.OrderDaoImp;
import com.zy.store.domain.Order;
import com.zy.store.domain.OrderItem;
import com.zy.store.domain.PageModel;
import com.zy.store.domain.User;
import com.zy.store.service.OrderService;
import com.zy.store.utils.JDBCUtils;

public class OrderServiceImp implements OrderService{
	OrderDao orderDao=new OrderDaoImp();

	@Override
	public void saveOrder(Order order) throws SQLException {
		// TODO Auto-generated method stub
		//保存订单和订单下所有的订单项(同时成功,失败)
		/*try {
			JDBCUtils.startTransaction();
			OrderDao orderDao=new OrderDaoImp();
			orderDao.saveOrder(order);
			for(OrderItem item:order.getList()){
				orderDao.saveOrderItem(item);
			}
			JDBCUtils.commitAndClose();
		} catch (Exception e) {
			JDBCUtils.rollbackAndClose();
		}
		*/
		Connection conn=null;
		try {
			//获取链接
			conn=JDBCUtils.getConnection();
			conn.setAutoCommit(false);
			orderDao.saveOrder(conn,order);
			for(OrderItem item : order.getList()) {
				orderDao.saveOrderItem(conn,item);
			}
			conn.commit();
			
		}catch(Exception e) {
			conn.rollback();
		}
		
	}

	@Override
	public PageModel findMyOrdersWithPage(User user, int curNum) throws Exception{
		// TODO Auto-generated method stub
		//1_创建PageModel对象,目的:计算并且携带分页参数
		//select count(*) from orders where uid=?
		int totalRecords=orderDao.getTotalRecords(user);
		PageModel pm=new PageModel(curNum,totalRecords,3);
		//关联集合 select * from orders where uid=? limit ?,?
		List list=orderDao.findMyOrdersWithPage(user,pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		pm.setUrl("OrderServlet?method=findMyOrdersWithPage");
		
		return pm;
	}

	@Override
	public Order findOrderByOid(String oid) throws Exception {
		// TODO Auto-generated method stub
		return orderDao.findOrderByOid(oid);
	}

	@Override
	public void updateOrder(Order order) throws Exception {
		// TODO Auto-generated method stub
		orderDao.updateOrder(order);
		
	}


	@Override
	public List<Order> findAllOrders(String st) throws Exception {
		// TODO Auto-generated method stub
		return orderDao.findAllOrders(st);
	}

	@Override
	public List<Order> findAllOrders() throws Exception {
		// TODO Auto-generated method stub
		return orderDao.findAllOrders();
	}

}
