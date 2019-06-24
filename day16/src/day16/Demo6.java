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
		return "{��ţ�"+this.id+"������"+this.name+"нˮ"+this.salary+"}";
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
		//����TreeSet��ʱ����Ƚ���
		TreeSet tree = new TreeSet(comparator);
		
		tree.add(new Emp(110, "��½", 100));
		tree.add(new Emp(113, "����", 200));
		tree.add(new Emp(220, "����", 300));
		tree.add(new Emp(120, "�ϲ�", 500));
		System.out.println("���ϵ�Ԫ�أ�"+tree);
		
	}

}
