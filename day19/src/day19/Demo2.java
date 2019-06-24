package day19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
     增强for循环要注意的事项
     1.增强for循环底层也是使用迭代器获取的，只不过获取迭代器是由jvm完成的
     2.迭代器遍历元素与增强for循环变量元素的区别：使用迭代器遍历集合的元素可以删除集合的元素，
        而增强for循环变量集合的元素时，不能调用迭代器的remove方法删除元素。
      3.普通for循环与增强for循环的区别，普通for循环可以没有变量的目标，而增强for循环一定要有变量的目标
 * */

public class Demo2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("狗娃");
		set.add("铁蛋");
		set.add("狗剩");
		//使用迭代器遍历set集合
		/*Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println("元素"+temp);
			it.remove();
		}*/
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("001", "张三");
		map.put("002", "李四");
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		for(Map.Entry<String, String>entry : entrys) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}

}
