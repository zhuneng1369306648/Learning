package day10;
/*
Ŀǰ��̬����²��ܷ����������еĳ�Ա��

�����Ҫ�����������еĳ�Ա����ô��Ҫ��������ǿ��ת��.


�����������͵�ת��
	
	С��������-------->�����������      �Զ�����ת��

	����������--------->С��������       ǿ������ת��     С��������  ������ = ��С�������ͣ�����������;


�����������͵�ת��
	
	С��������--------->����������     �Զ�����ת����

	����������--------->С��������      ǿ������ת��

����ת����������⣺ java.lang.ClassCastException�� ǿ������ת��ʧ�ܡ�


*/
//������
abstract class Animal{

	String name;

	public Animal(String name){
		this.name = name;
	}

	public abstract void run();
}

//����
class  Mouse extends Animal{


	public Mouse(String name){
		super(name);
	}
	
	public  void run(){
		System.out.println(name+"��������������!");
	}

	//�������з���---��
	public void dig(){
		System.out.println("�����ڴ�..");
	}
}



//��
class Fish extends Animal{

	public Fish(String name){
		super(name);
	}

	public  void run(){
		System.out.println(name+"ҡҡβ���ΰ��� !");
	}


	//������
	public void bubble(){
		System.out.println(name+"������...!");
	}

}




class Demo2 
{
	public static void main(String[] args) 
	{
		/*
		Animal a = new Mouse("����");  //��̬
		//�����������еķ���
		Mouse m  = (Mouse)a;  //ǿ������ת��
		m.dig();
		*/

		Mouse m = new Mouse("������");
		Fish f = new Fish("����");

		print(f);

	}


	//���� ����һ���������Խ����������͵Ķ�������ں����ڲ�Ҫ���õ��������еķ�����
	public static void print(Animal a){ // Animal a   = new Mouse("������");
		if(a instanceof Fish){
			Fish f = (Fish)a;
			f.bubble();
		}else if(a instanceof Mouse){
			Mouse m = (Mouse)a;
			m.dig();
		}
	}


}
