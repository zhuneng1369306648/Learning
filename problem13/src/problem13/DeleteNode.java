package problem13;
/*
 * ������13����O(1)ʱ��ɾ��������
 * �������������ͷָ���һ�����ָ�룬����һ��������O(1)ʱ��ɾ���ý�㡣
 * ˼·��һ��˼·�Ǵ�ͷ��ʼ�������������Ӷ���O(n)�������⡣���ǵķ����ǰѸýڵ��ֵ��Ϊ�ýڵ���һ���ڵ��ֵ��Ȼ���øýڵ�ָ������һ���ڵ㡣
 * �����������������1��Ҫɾ���Ľڵ㲻��β�ڵ㡣2������ֻ��һ���ڵ�3��Ҫɾ���Ľڵ���β�ڵ㣬ֻ�ܴ�ͷ��β�����ˡ����ƽ��һ�¸��ӶȻ���O(1)��
 */
/*class ListNode{
	int value;
	ListNode next;
	ListNode(int x){
		value = x;
		next = null;
	}
}
public class DeleteNode {
	static void delete(ListNode headNode,ListNode toBeDeleted){
		if(headNode == null || toBeDeleted == null){
			System.out.println("����null");
			return;
		}
		if(toBeDeleted.next != null){//1,Ҫɾ���Ľڵ㲻��β�ڵ�
			toBeDeleted.value = toBeDeleted.next.value;
			toBeDeleted.next = toBeDeleted.next.next;
		}else if(headNode.next == toBeDeleted){//2������ֻ��һ���ڵ㣬Ҫ��ͷָ����ΪNULL��
			headNode.next = null;
		}else{//3��Ҫɾ���Ľڵ���β�ڵ�
			while(headNode.next != toBeDeleted){
				headNode = headNode.next;
			}
			headNode.next = null;
		}
	}
	public static void main(String[] args){
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		head.next = one;
		one.next = two;
		delete(head, one);
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
}*/
class ListNode{
	int value;
	ListNode next;
	ListNode(int x){
		value = x;
		next = null;
	}
}
public class DeleteNode{
	static void delete(ListNode headNode,ListNode toBeDeleted) {
		if(headNode == null || toBeDeleted == null) {
			System.out.println("����null");
			return;
		}
		if(toBeDeleted.next != null) {
			toBeDeleted.value = toBeDeleted.next.value;
			toBeDeleted.next=toBeDeleted.next.next;
		}else if(headNode.next == toBeDeleted) {
			headNode.next=null;
		}else {
			while(headNode.next != toBeDeleted) {
				headNode = headNode.next;
			}
			headNode.next = null;
		}
	}
	public static void main(String[] args){
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		head.next = one;
		one.next = two;
		delete(head, one);
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
}
