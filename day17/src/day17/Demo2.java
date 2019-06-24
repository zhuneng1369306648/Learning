package day17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *
 *   映射关系出现存在的，也就是成对出现的
 *   双列集合：
      --------------|Map   如果实现了Map接口的集合类，具备的特点，存储的数据
             -----------|HashMap
             ------------|TreeMap
             -------------|HashTable
     
 * */

public class Demo2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		//添加
		map.put("你好", "章子怡");
		map.put("文章", "姚笛");
		map.put("谢霆锋","张柏芝");
		//System.out.println("返回值"+map.put("谢霆锋", "没有"));//如果之前们存在该键，键不可重复，值可以重复
		
		
		
		/*Map<String,String> map2 = new HashMap<String,String>();
		map2.put("1", "1");
		map2.put("2", "1");
		map.putAll(map2);
		System.out.println(map2);*/
		/*System.out.println("删除的数据"+map.remove("你好"));//键是唯一的
		map.clear();*/
		
		/*System.out.println(map.get("文章"));
		System.out.println(map.size());*/
		
		
		/*System.out.println("判断是否包含自定的键"+map.containsKey("姚笛"));
		System.out.println(map.containsValue("姚笛"));*/
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
