package com.zhaoyu.test;

import java.util.Stack;

public class Test05 {
	/*节点对象*/
	public static class ListNode{
		int val; //结点的值
		ListNode nxt; // 下一个结点
	}
	/*输入个链表的头结点，从尾到头反过来打印每个结点的值，
	使用栈的方式进行，先进后出*/

	public static void printListInverselyUsingIteration(ListNode root) {
		Stack<ListNode> stack = new Stack<>();
		while(root != null) {
			stack.push(root);
			root = root.nxt;
		}
		ListNode tmp;
		while(!stack.isEmpty()) {
			tmp = stack.pop();
			System.out.println(tmp.val + " ");
		}
	}
	/**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用栈的方式进行   //(递归？)
     *
     * @param root 链表头结点
     */
    public static void printListInverselyUsingRecursion(ListNode root) {
        if (root != null) {
            printListInverselyUsingRecursion(root.nxt);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.val = 1;
        root.nxt = new ListNode();
        root.nxt.val = 2;
        root.nxt.nxt = new ListNode();
        root.nxt.nxt.val = 3;
        root.nxt.nxt.nxt = new ListNode();
        root.nxt.nxt.nxt.val = 4;
        root.nxt.nxt.nxt.nxt = new ListNode();
        root.nxt.nxt.nxt.nxt.val = 5;

        printListInverselyUsingIteration(root);
        System.out.println();
        printListInverselyUsingRecursion(root);
    }
}
