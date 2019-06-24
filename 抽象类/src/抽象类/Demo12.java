package ������;
/*
��̬��Ӧ�ã�
  1. ��̬�����β����͵�ʱ�򣬿��Խ��ո������͵����� ��
  2. ��̬���ڷ���ֵ���͵�ʱ�򣬿��Է��ظ������͵����ݡ�



��̬�ĺô��� ����˴������չ�ԡ�

����1�� ����һ���������Խ����������͵�ͼ�ζ��󣬲��Ҵ�ӡͼ��������ܳ���
*/

//ͼ����
abstract class MyShape{

	public abstract void getArea();

	public abstract void getLength();	
}



class Circle1 extends MyShape{

	public static final double PI = 3.14;

	double r;

	public Circle1(double r){
		this.r =r ;	
	}

	public  void getArea(){
		System.out.println("Բ�ε������"+ PI*r*r);
	}

	public  void getLength(){
		System.out.println("Բ�ε��ܳ���"+ 2*PI*r);
	}
}


class Rect  extends MyShape{

	int width;

	int height;

	public Rect(int width , int height){
		this.width = width;
		this.height = height;
	}

	public  void getArea(){
		System.out.println("���ε������"+ width*height);
	}

	public  void getLength(){
		System.out.println("���ε��ܳ���"+ 2*(width+height));
	}
}



class Demo12 {

	public static void main(String[] args) 
	{
		/*
		//System.out.println("Hello World!");
		Circle c = new Circle(4.0);
		print(c);

		Rect r = new Rect(3,4);
		print(r);
		*/

		MyShape m = getShape(0); //������ʹ�ö�̬�ķ���������ı�������Ҫ�뷵��ֵ����һ�¡�
		m.getArea();
		m.getLength();
		

	}


	//����1�� ����һ���������Խ����������͵�ͼ�ζ��󣬲��Ҵ�ӡͼ��������ܳ���
	public static void print(MyShape s){ // MyShpe s = new Circle(4.0);
		s.getArea();
		s.getLength();
	}


	// ����2�� ����һ���������Է����������͵�ͼ�ζ���
	public static MyShape  getShape(int i){
		if (i==0){
			return new Circle1(4.0);
		}else{
			return new Rect(3,4);
		}
	}


}
