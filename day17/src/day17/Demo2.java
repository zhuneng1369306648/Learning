package day17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *
 *   ӳ���ϵ���ִ��ڵģ�Ҳ���ǳɶԳ��ֵ�
 *   ˫�м��ϣ�
      --------------|Map   ���ʵ����Map�ӿڵļ����࣬�߱����ص㣬�洢������
             -----------|HashMap
             ------------|TreeMap
             -------------|HashTable
     
 * */

public class Demo2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		//���
		map.put("���", "������");
		map.put("����", "Ҧ��");
		map.put("л����","�Ű�֥");
		//System.out.println("����ֵ"+map.put("л����", "û��"));//���֮ǰ�Ǵ��ڸü����������ظ���ֵ�����ظ�
		
		
		
		/*Map<String,String> map2 = new HashMap<String,String>();
		map2.put("1", "1");
		map2.put("2", "1");
		map.putAll(map2);
		System.out.println(map2);*/
		/*System.out.println("ɾ��������"+map.remove("���"));//����Ψһ��
		map.clear();*/
		
		/*System.out.println(map.get("����"));
		System.out.println(map.size());*/
		
		
		/*System.out.println("�ж��Ƿ�����Զ��ļ�"+map.containsKey("Ҧ��"));
		System.out.println(map.containsValue("Ҧ��"));*/
		/*System.out.println(map.keySet());
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+map.get(key));
		}*/
		/*Collection<String> c = map.values();
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		Set<Map.Entry<String, String>> entrys=map.entrySet();
		Iterator<Map.Entry<String, String>> it = entrys.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> entry = it.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		
		
		
		System.out.println(map);
	}

}
