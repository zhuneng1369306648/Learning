package day16;

import java.util.Comparator;
import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	int salary;
	public Emp(int id,String name,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "{编号："+this.id+"姓名："+this.name+"薪水"+this.salary+"}";
	}
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.salary - o.salary;
	}
}
class MyComparator implements Comparator<Emp>{
	public int compare(Emp o1,Emp o2) {
		return o1.id-o2.id;
	}
}
public class Demo6 {
	public static void main(String[] args) {
		MyComparator comparator = new MyComparator();
		//创建TreeSet的时候传入比较器
		TreeSet tree = new TreeSet(comparator);
		
		tree.add(new Emp(110, "老陆", 100));
		tree.add(new Emp(113, "老钟", 200));
		tree.add(new Emp(220, "老汤", 300));
		tree.add(new Emp(120, "老蔡", 500));
		System.out.println("集合的元素："+tree);
		
	}

}
