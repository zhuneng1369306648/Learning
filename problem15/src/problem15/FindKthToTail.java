package problem15;

import java.util.Scanner;

/*
 * ������15�������е�����K�����
 * ����һ������������������е�����k����㡣�����β����ǵ�����1����㡣����һ��������4����㣬������1,2,3,4,�������ĵ�����3�������2��
 * ˼·1������������n����㣬��ô������k�������Ǵ�ͷ��ʼ�ĵ�n-k+1����㡣����һ�ַ����Ǳ�������������һ�εõ�n���ڶ����ҵ�k��
 * ˼·2�����õķ�����ֻ�����һ�Σ����Ƕ�������ָ�룬��һ��ָ���ͷ��ʼ��k-1�����ӵ�k����ʼ���ڶ���ָ��Ҳ��ʼ��ͷ��ʼ�ߣ�����ָ��ľ���Ϊk-1������һ��ָ�뵽��β���ʱ���ڶ���ָ��պ��ڵ�����k����
 * �����1����������м��㡣����ǽ������ż���������м���������һ����Ҳ����������ָ�룬һ��ָ��һ����һ������һ�����������ߵÿ�ĵ�ĩβʱ���ߵ����ĸպ����м��㡣
 * �����2���жϵ������Ƿ��γɻ��νṹ������һ��ָ����һ����һ��ָ�����������ߵÿ��ָ�����׷���ߵ�����ָ�룬��ô���ǻ��εġ�����ߵÿ���ߵ���ĩβ��û��׷�ϣ�˵�����ǻ��Ρ�
 */
/*
class ListNode{
	int value;
	ListNode next;
	ListNode(int x){
		value = x;
		next = null;
	}
}
public class FindKthToTail {
	//ͷ�巨��������,�������ͷ�����ǵ�һ����㡣
	private ListNode insertFirst(){
		Scanner sc = new Scanner(System.in);
		ListNode headNode = null;
		System.out.println("��������ֵ����0������");
		int input = sc.nextInt();
		while(input != 0){
			ListNode p = new ListNode(input);
			p.next = headNode;
			headNode = p;
			input = sc.nextInt();
		}
		return headNode;
	}
	//�����ӡ����
	private void print(ListNode headNode){
		if(headNode == null){
			System.out.println("��ӡ����������Ϊ��");
			return;
		}
		while(headNode != null){
			System.out.println(headNode.value);
			headNode = headNode.next;
		}
	}
	//�ҵ�������k��
	private ListNode find(ListNode headNode, int k){
		if(headNode == null || k <= 0){
			System.out.println("����Ϊ�ջ�k����");
			return null;
		}
		ListNode p1 = headNode;
		ListNode p2 = headNode;
		for(int i=0;i<k-1;i++){//p1����k-1��
			if(p1.next != null){
				p1 = p1.next;
			}else{
				System.out.println("����k����");
				return null;
			}
		}
		while(p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	public static void main(String[] args) {
		FindKthToTail test = new FindKthToTail();
		ListNode ln = test.insertFirst();
		test.print(ln);
		System.out.println("������k��");
		Scanner sc = new Scanner(System.in);	
		int k = sc.nextInt();
		System.out.println("������"+k+"����:" + test.find(ln,k).value);
		sc.close();
	}
}
*/


class ListNode{
	int value;
	ListNode next;
	ListNode(int x){
		value = x;
		next = null;
	}
}
public class FindKthToTail{
	private ListNode insertFirst() {
		Scanner sc = new Scanner(System.in);
		ListNode headNode = null;
		System.out.println("��������ֵ��0����");
		int input = sc.nextInt();
		while(input != 0) {
			ListNode p = new ListNode(input);
			p.next = headNode;
			headNode = p;
			input = sc.nextInt();
		}
		return headNode;
	}
	private void print(ListNode headNode) {
		if(headNode == null) {
			System.out.println("��ӡ��������Ϊ��");
			return;
		}
		while(headNode != null) {
			System.out.println(headNode.value);
			headNode = headNode.next;
		}
	}
	private ListNode find(ListNode headNode,int k) {
		if(headNode == null || k<=0) {
			System.out.println("����Ϊ�ջ���k����");
			return null;
		}
		ListNode p1 = headNode;
		ListNode p2 = headNode;
		for(int i=0;i<k-1;i++) {
			if(p1.next != null) {
				p1=p1.next;
			}else {
				System.out.println("shuruk ����");
				return null;
			}
		}
		while(p1.next != null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
	}
	public static void main(String[] args) {
		FindKthToTail test = new FindKthToTail();
		ListNode ln = test.insertFirst();
		test.print(ln);
		System.out.println("������k��");
		Scanner sc = new Scanner(System.in);	
		int k = sc.nextInt();
		System.out.println("������"+k+"����:" + test.find(ln,k).value);
		sc.close();
	}
}

