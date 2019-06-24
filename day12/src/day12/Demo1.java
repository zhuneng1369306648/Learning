package day12;
/*
 * 
 * */
class Person{
	int id;
	String name;
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println("toString"+o.toString());
		System.out.println(o);
		Person p = new Person(110,"¹·ÍÞ");
		Person p1 = new Person(110,"¹·ÍÞ");
		System.out.println(p.equals(p1));
		System.out.println(p.toString());
		
	}

}
