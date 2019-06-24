package 抽象类;
/*
 * 抽象类应用
 * 行为不具体，但是具有一种行为,
 * 抽象类好处，强制要求子类实现自定的方法，
 * 抽象类注意细节
 * 1.抽象类可以存在费抽象方法，也可以存在抽象方法，
 * 2.抽象类可以没有抽象方法，
 * 3.抽象类不能创建对象
 *     why:
 *       因为抽象类是存在抽象方法的，而如果能让抽象类创建对象的话，那么调用抽象方法无意义
 * 4.构造函数提供给子类创建对象的时候初始化父类的属性。    
 *       
 * */
/*
public class Demo3 {
	public static void main(String[] args) {
		//Animal a = new Animal();
		
	}

}
abstract class Animal{//抽象类
	String name;
	String color;
	public Animal(String name,String color) {
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println(name+"吃东西");
	}
	public abstract void run();
}
class Dog extends Animal{
	public Dog(String name,String color) {
		super(name,color);
	}
	public void run() {
		System.out.println(name+"四条腿跑得快");
	}
}
class Fish extends Animal{
	public Fish(String name,String color) {
		super(name,color);
	}
	public void run() {
		System.out.println(name+"游得快");
	}
}*/
public class Demo3{
	public static void main(String[] args) {
		
	}
}
abstract class graph{
	String name;
	public graph(String name) {
		this.name = name;
	}
	
	public abstract void getArea();
	public abstract void getLength();
}
class Circle extends graph{
	double r;
	public static final double PA= 3.14;
	public Circle(String name,double r) {
		super(name);
		this.r = r;
	}
	public void getArea() {
		System.out.println(name+"面积是"+PA*r*r);
	}
	public void getLength() {
		System.out.println(name+"周长为"+2*PA*r);
	}
}

