package 实现类;

import java.util.ArrayList;
import java.util.Collections;

/*   
 * Collections:集合的工具类
 *      collections 和collction的区别
 *          Collections是集合的工具类，Collction是集合接口
 *          
 * 
 * 
 * 
 * */


public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
	    list.add(1);
		Collections.sort(list);
		System.out.println(list);
	}

}
