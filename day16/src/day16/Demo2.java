package day16;

import java.util.HashSet;

/*
 * 集合的体系
 *    |Collection单例集合的根接口
 *        |list 如果是实现了list接口的集合类，具备的特点，有序，可重复
 *            ArrayList 底层维护了一个object数组实现， 查询熟读快，上增删慢
 *            LinkedList 底层使用了链表的数据结构，查询速度慢，增删快
 *        
 *        |set  如果是实现了set接口的集合类，具备的特点，无序，不可重复
 *            |hashset   底层使用了哈希表支持，特点。 存取速度快
 *            hashSet的实现原理：
	往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值 ，
	然后通过元素 的哈希值经过移位等运算，就可以算出该元素在哈希表中 的存储位置。
	
	情况1： 如果算出元素存储的位置目前没有任何元素存储，那么该元素可以直接存储到该位置上。

	情况2： 如果算出该元素的存储位置目前已经存在有其他的元素了，那么会调用该元素的equals方法与该位置的元素再比较一次
	，如果equals返回的是true，那么该元素与这个位置上的元素就视为重复元素，不允许添加，如果equals方法返回的是false，那么该元素运行 添加。
	
     
 *        */

class Person{
	int id;
	String name;
	public Person(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "{编号："+this.id+"姓名"+this.name+"}";
	}
	public int hashCode() {
		System.out.println("hashcode调用");
		return this.id;
	}
	public boolean equals(Object obj) {
		System.out.println("equals 方法");
		Person p = (Person)obj;
		return this.id==p.id;
		}
}
public class Demo2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Person(110,"狗娃"));
		set.add(new Person(220,"狗剩"));
		set.add(new Person(330,"铁蛋"));
		//在现实生活中只要编号一致就为同一个人.
		System.out.println("添加成功吗？"+set.add(new Person(110,"狗娃")));
		System.out.println("集合的元素："+set);
	}

}
