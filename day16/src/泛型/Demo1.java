package 泛型;

import java.util.ArrayList;

/*
 * 
 * 泛型的好处
 *     1.将运行时的异常提前到了编译时
 *     2.避免了无畏的强制转换
   
   
   
   
 * */

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println("大写"+str.toUpperCase());
		}
		MyUtil.print(list);
		ArrayList<String> list2 = MyUtil.getList();
		
	}

}
