package ����;

public class SequenceStackTest {
	public static void main(String[] args)
	{
		SequenceStack<String> stack = new SequenceStack<String>();
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		stack.push("dddd");
		System.out.println(stack);
		System.out.println("����ջ��Ԫ��" + stack.peek());
		System.out.print("��һ�ε���ջ��Ԫ��" + stack.pop());
		System.out.println("�������ջ" + stack);
	}

}
