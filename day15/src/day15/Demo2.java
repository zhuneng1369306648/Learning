package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *    Collection 单例集合的根接口
 *        List 如果是实现了List接口的集合类，该集合具备的特点，有序，可重复
 *        Set 如果是实现了Set接口的集合类，该集合具备的特点，无序，不可重复*/
public class Demo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("狗娃");
		c.add("狗剩");
		c.add("铁蛋");
//		Object[] arr =c.toArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+",");
		//}
		//要求使用iterator遍历
		Iterator it = c.iterator();//迭代器，作用，就是用于抓取集合中的元素
	    //返回的是实现类对象
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println("元素"+it.next());
		}
		
	}

}
