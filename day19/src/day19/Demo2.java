package day19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
     ��ǿforѭ��Ҫע�������
     1.��ǿforѭ���ײ�Ҳ��ʹ�õ�������ȡ�ģ�ֻ������ȡ����������jvm��ɵ�
     2.����������Ԫ������ǿforѭ������Ԫ�ص�����ʹ�õ������������ϵ�Ԫ�ؿ���ɾ�����ϵ�Ԫ�أ�
        ����ǿforѭ���������ϵ�Ԫ��ʱ�����ܵ��õ�������remove����ɾ��Ԫ�ء�
      3.��ͨforѭ������ǿforѭ����������ͨforѭ������û�б�����Ŀ�꣬����ǿforѭ��һ��Ҫ�б�����Ŀ��
 * */

public class Demo2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("����");
		set.add("����");
		set.add("��ʣ");
		//ʹ�õ���������set����
		/*Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println("Ԫ��"+temp);
			it.remove();
		}*/
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("001", "����");
		map.put("002", "����");
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		for(Map.Entry<String, String>entry : entrys) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}

}
