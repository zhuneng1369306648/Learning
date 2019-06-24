package problem16;
/*
 * ������16����ת�����ݹ�ͷǵݹ飩
 * ����һ�������ͷ��㣬��ת�����������ת�������ͷ��㡣
 * ˼·1����������ָ�룬�ֱ��ǵ�ǰҪ��ת�Ľ�㣬����ǰһ�����ͺ�һ����㡣
 * ˼·2���õݹ顣���ҵ�������������㷴ת��������ǰ��
 */
/*class ListNode{
	int value;
	ListNode next;
	public ListNode(int x) {
		value = x;
	}
}
public class ReverseList {
	private ListNode reverseList(ListNode headNode){
		if(headNode == null){
			System.out.println("����ͷ���Ϊ��");
			return null;
		}
		ListNode nowNode = headNode;//��ǰҪ��ת�Ľ��
		ListNode preNode = null;//ǰһ�����
		ListNode nextNode = null;//��һ�����
		ListNode revHead = null;//��ת���ͷ���
		while(nowNode != null){
			if(nowNode.next == null){//��ת���ͷ�����֮ǰ��β���
				revHead = nowNode;
			}
			nextNode = nowNode.next;
			nowNode.next = preNode;
			preNode = nowNode;
			nowNode = nextNode;
		}
		return revHead;
	}
	private void print(ListNode headNode){
		if(headNode == null){
			System.out.println("����ͷ���Ϊ��");
			return;
		}
		while(headNode != null){
			System.out.println(headNode.value);
			headNode = headNode.next;
		}
	}
	//�ݹ鷽��(��̫�����)
	private ListNode digui(ListNode headNode){
		//�ж�����Ϊ�ջ���������ֻ��һ��Ԫ��
		if(headNode == null || headNode.next == null){
			return headNode;
		}else{
			ListNode revHead = digui(headNode.next);//�ȷ�ת���������
			headNode.next.next = headNode;//��ת
			headNode.next = null;
			return revHead;
		}
	}
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		one.next = two;
		two.next = three;
		ReverseList test = new ReverseList();
		System.out.println("��תǰ:");
		test.print(one);
		System.out.println("��ת��:");
		//test.print(test.reverseList(one));
		test.print(test.digui(one));
	}
}*/
class ListNode{
	int value;
	ListNode next;
	public  ListNode(int x) {
		value = x;
	}
}
public class ReverseList{
	private ListNode reverseList(ListNode headNode) {
		if(headNode == null) {
			System.out.println("�����ͷ���Ϊ��");
			return null;
		}
		ListNode nowNode = headNode;
		ListNode preNode = null;
		ListNode nextNode = null;
		ListNode revHead = null;
		while(nowNode != null) {
			if(nowNode.next == null) {
				revHead = nowNode;
			}
			nextNode = nowNode.next;
			nowNode .next = preNode;
			preNode = nowNode;
			nowNode = nextNode;
		}
		return revHead;
	}
	private void print(ListNode headNode) {
		if(headNode == null) {
			System.out.println("�����ͷ���Ϊ��");
			return;
		}
		while(headNode != null) {
			System.out.println(headNode.value);
			headNode = headNode.next;
			
		}
	}
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		one.next = two;
		two.next = three;
		ReverseList test = new ReverseList();
		System.out.println("��תǰ:");
		test.print(one);
		System.out.println("��ת��:");
		test.print(test.reverseList(one));
		//test.print(test.digui(one));
	}
}