package ����;

import java.util.ArrayList;

/*
 * 
 * ���͵ĺô�
 *     1.������ʱ���쳣��ǰ���˱���ʱ
 *     2.��������η��ǿ��ת��
   
   
   
   
 * */

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println("��д"+str.toUpperCase());
		}
		MyUtil.print(list);
		ArrayList<String> list2 = MyUtil.getList();
		
	}

}
