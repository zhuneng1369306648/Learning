package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *    Collection �������ϵĸ��ӿ�
 *        List �����ʵ����List�ӿڵļ����࣬�ü��Ͼ߱����ص㣬���򣬿��ظ�
 *        Set �����ʵ����Set�ӿڵļ����࣬�ü��Ͼ߱����ص㣬���򣬲����ظ�*/
public class Demo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("����");
		c.add("��ʣ");
		c.add("����");
//		Object[] arr =c.toArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+",");
		//}
		//Ҫ��ʹ��iterator����
		Iterator it = c.iterator();//�����������ã���������ץȡ�����е�Ԫ��
	    //���ص���ʵ�������
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println("Ԫ��"+it.next());
		}
		
	}

}
