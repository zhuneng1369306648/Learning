package day15;
//������������ֵ���޾���list
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
     public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");
		list.add(2,"����");
		
		
		List list2 = new ArrayList(); 
		list2.add("����");
		list2.add("С����");
		list.addAll(list2);
		System.out.println(list);
	
		
		
	}
}
