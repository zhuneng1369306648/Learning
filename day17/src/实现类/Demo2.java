package ʵ����;

import java.util.ArrayList;
import java.util.Collections;

/*   
 * Collections:���ϵĹ�����
 *      collections ��collction������
 *          Collections�Ǽ��ϵĹ����࣬Collction�Ǽ��Ͻӿ�
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
