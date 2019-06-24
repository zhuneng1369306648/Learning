package day15;
//如果想操作索引值南无就用list
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
     public static void main(String[] args) {
		List list = new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		list.add(2,"张三");
		
		
		List list2 = new ArrayList(); 
		list2.add("奔三");
		list2.add("小城阳");
		list.addAll(list2);
		System.out.println(list);
	
		
		
	}
}
