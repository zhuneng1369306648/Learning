	package day10;

	/*

	�����ڲ��ࣺû����������ͳ���Ϊ�����ڲ��ࡣ

	�����ڲ���ĺô�������д��

	�����ڲ����ʹ��ǰ�᣺������ڼ̳л���ʵ�ֹ�ϵ����ʹ�á�


	�����ڲ���һ��������ʵ�Ρ�


	*/

	abstract class Animal1{
		
		public abstract Animal1 run();

		public abstract void sleep();

		public void bite() {
			// TODO Auto-generated method stub
			
		}
	}


	class Outer2{

		public void print(){
			//���� �ڷ����ڲ�����һ����̳�Animal�࣬Ȼ�����run������sleep()��
			
			/*
			//�ֲ��ڲ���
			class Dog extends Animal{
				
				public void run(){
					System.out.println("������..");
				}

				public void sleep(){
					System.out.println("��ſ�������۾�˯..");
				}
			}
			
			//��������
			Dog d = new Dog();
			d.run();	
			d.sleep();
			*/	
			//�����ڲ��� �������ڲ���ֻ��û��������������һ�ų�Ա���Ǿ߱��ġ�
			// �����ڲ�����Animal�Ǽ̳� �Ĺ�ϵ��  Ŀǰ�Ǵ���Animal����Ķ���. 
		Animal1	a = new Animal1(){  //��̬
			
				//�����ڲ��ĳ�Ա 
				public Animal1 run(){
					System.out.println("������..");
					return this;
				}
				
				public void sleep(){
					System.out.println("��ſ�������۾�˯..");
				}

				//���еķ���
				public void bite(){
					System.out.println("����ҧ��..");
				}
		
			};
		
			a.bite();
			a.run();
			a.sleep();
			
		}
	}



	class Demo6 
	{
		public static void main(String[] args) 
		{
			//System.out.println("Hello World!");
			
			Outer2 outer = new Outer2();
			outer.print();
		
		}
	}
