package ������;
/*
 * ������Ӧ��
 * ��Ϊ�����壬���Ǿ���һ����Ϊ,
 * ������ô���ǿ��Ҫ������ʵ���Զ��ķ�����
 * ������ע��ϸ��
 * 1.��������Դ��ڷѳ��󷽷���Ҳ���Դ��ڳ��󷽷���
 * 2.���������û�г��󷽷���
 * 3.�����಻�ܴ�������
 *     why:
 *       ��Ϊ�������Ǵ��ڳ��󷽷��ģ���������ó����ഴ������Ļ�����ô���ó��󷽷�������
 * 4.���캯���ṩ�����ഴ�������ʱ���ʼ����������ԡ�    
 *       
 * */
/*
public class Demo3 {
	public static void main(String[] args) {
		//Animal a = new Animal();
		
	}

}
abstract class Animal{//������
	String name;
	String color;
	public Animal(String name,String color) {
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println(name+"�Զ���");
	}
	public abstract void run();
}
class Dog extends Animal{
	public Dog(String name,String color) {
		super(name,color);
	}
	public void run() {
		System.out.println(name+"�������ܵÿ�");
	}
}
class Fish extends Animal{
	public Fish(String name,String color) {
		super(name,color);
	}
	public void run() {
		System.out.println(name+"�εÿ�");
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
		System.out.println(name+"�����"+PA*r*r);
	}
	public void getLength() {
		System.out.println(name+"�ܳ�Ϊ"+2*PA*r);
	}
}

