package ���򷵻�����;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/*
 * ������5������һ�������ͷ��㣬��β��ͷ��ӡÿ���ڵ��ֵ������ӡ����һ�㲻�ı�����Ľṹ��
 * ˼·1�����͵ĺ���ȳ�����ջ��
 * ˼·2������ջ�����õݹ�(����̫���������)�����ʵ�һ���ڵ�󣬵ݹ����������Ľڵ㣬������ýڵ�����
 *//*
public class PrintListReversingly {
	//β�巨���������������Ϊͷ���(ͷ��㱾��û��ֵ)
	static ListNode createList(ListNode headNode){
		ListNode p = headNode;
		//ȷ��ͷ����Ƿ�Ϊ��
		if(p == null){
			System.out.println("����ͷ���Ϊ�գ����顣");
			return null;
		}else{
			Scanner sc = new Scanner(System.in);
			System.out.println("���������ֵ����0������");
			int n = sc.nextInt();
			while(n != 0){
				//qΪҪ������½ڵ�
				ListNode q = new ListNode();
				q.data = n;
				q.next = null;
				p.next = q;
				//pʼ��ָ�����һ�����
				p = q;
				n = sc.nextInt();
			}
			sc.close();
		}
		return headNode;
	}
	//��β��ͷ��ӡ,��ջ��
	static void print(ListNode headNode){
		Stack<ListNode> stack = new Stack<>();
		//������費���ͷ��㡣
		while(headNode != null && headNode.next != null){
			stack.push(headNode.next);
			headNode = headNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().data);
		}
	}
	public static void main(String[] args) {
		ListNode test = new ListNode();
		//ListNode test = null;
		print(createList(test));
	}
}
class ListNode{
	int data;
	ListNode next = null;
}
//�ݹ鷽���������ο������ص�arrayList�Ѿ��ǵ����ˡ�
//public ArrayList<Integer> print2(ListNode headNode){
//	ArrayList<Integer> arrayList = new ArrayList<>();
//	if(headNode != null){
//		print2(headNode.next);
//		arrayList.add(headNode.data);
//	}
//	return arrayList;
//}


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PrintListReversingly {
	static ListNode createList(ListNode headNode) {
		ListNode p = headNode;
		if(p==null) {
			System.out.println("����ͷ���Ϊ�գ�����");
			return null;
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("���������ֵ����0����");
			int n=sc.nextInt();
			while(n !=0) {
				ListNode q = new ListNode();
				q.data = n;
				q.next = null;
				p.next = q;
				p=q;
				n=sc.nextInt();
			}sc.close();
		}
		return headNode;
	}
	static void print(ListNode headNode) {
		Stack<ListNode> stack = new Stack<>();
		while(headNode != null && headNode.next != null) {
			stack.push(headNode.next);
			headNode = headNode.next;
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().data);
		}
	}
	public static void main(String[] args) {
		ListNode test = new ListNode();
		print(createList(test));
	}

}
class ListNode{
	int data;
	ListNode next = null;
}
*/

public class PrintListReversingly{
	static ListNode createList(ListNode headNode) {
		ListNode p = headNode;
		if(p==null) {
			System.out.println("����ͷ���Ϊ�գ�����");
			return null;
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("���������ֵ��0����");
			int n= sc.nextInt();
			while(n != 0) {
				ListNode q = new ListNode();
				q.data = n;
				q.next  = null;
				p.next = q;
				p=q;
				n=sc.nextInt();
			}
			sc.close();
		}
		return headNode;
	}
}
class ListNode{
	int data;
	ListNode next = null;
}