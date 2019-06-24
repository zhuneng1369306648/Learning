package  µœ÷¿‡;

import java.util.HashMap;

class Person{
	int id;
	String name;
	public Person(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		HashMap<Person,String> map = new HashMap<Person,String>();
		map.put(new Person(110,"π∑Õﬁ"),"001");
	}

}
