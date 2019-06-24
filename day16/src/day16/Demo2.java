package day16;

import java.util.HashSet;

/*
 * ���ϵ���ϵ
 *    |Collection�������ϵĸ��ӿ�
 *        |list �����ʵ����list�ӿڵļ����࣬�߱����ص㣬���򣬿��ظ�
 *            ArrayList �ײ�ά����һ��object����ʵ�֣� ��ѯ����죬����ɾ��
 *            LinkedList �ײ�ʹ������������ݽṹ����ѯ�ٶ�������ɾ��
 *        
 *        |set  �����ʵ����set�ӿڵļ����࣬�߱����ص㣬���򣬲����ظ�
 *            |hashset   �ײ�ʹ���˹�ϣ��֧�֣��ص㡣 ��ȡ�ٶȿ�
 *            hashSet��ʵ��ԭ��
	��Haset���Ԫ�ص�ʱ��HashSet���ȵ���Ԫ�ص�hashCode�����õ�Ԫ�صĹ�ϣֵ ��
	Ȼ��ͨ��Ԫ�� �Ĺ�ϣֵ������λ�����㣬�Ϳ��������Ԫ���ڹ�ϣ���� �Ĵ洢λ�á�
	
	���1�� ������Ԫ�ش洢��λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ�Ӵ洢����λ���ϡ�

	���2�� ��������Ԫ�صĴ洢λ��Ŀǰ�Ѿ�������������Ԫ���ˣ���ô����ø�Ԫ�ص�equals�������λ�õ�Ԫ���ٱȽ�һ��
	�����equals���ص���true����ô��Ԫ�������λ���ϵ�Ԫ�ؾ���Ϊ�ظ�Ԫ�أ���������ӣ����equals�������ص���false����ô��Ԫ������ ��ӡ�
	
     
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
		return "{��ţ�"+this.id+"����"+this.name+"}";
	}
	public int hashCode() {
		System.out.println("hashcode����");
		return this.id;
	}
	public boolean equals(Object obj) {
		System.out.println("equals ����");
		Person p = (Person)obj;
		return this.id==p.id;
		}
}
public class Demo2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Person(110,"����"));
		set.add(new Person(220,"��ʣ"));
		set.add(new Person(330,"����"));
		//����ʵ������ֻҪ���һ�¾�Ϊͬһ����.
		System.out.println("��ӳɹ���"+set.add(new Person(110,"����")));
		System.out.println("���ϵ�Ԫ�أ�"+set);
	}

}
