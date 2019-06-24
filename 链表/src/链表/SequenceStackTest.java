package 链表;

public class SequenceStackTest {
	public static void main(String[] args)
	{
		SequenceStack<String> stack = new SequenceStack<String>();
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		stack.push("dddd");
		System.out.println(stack);
		System.out.println("访问栈顶元素" + stack.peek());
		System.out.print("第一次弹出栈顶元素" + stack.pop());
		System.out.println("弹出后的栈" + stack);
	}

}
