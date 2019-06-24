package ������������;
/*һ�����������������������ʸ��ڵ㲻���㣬���Խ�����������չ����������
 * ÿ���ڵ��ס���ҽڵ�͸��ڵ�
 * class Node
 * {
 * T data;
 * Node left;
 * Node right;
 * Node parent;
 * }
 * ��������ӽڵ�Ҳ�ǳ�����
 * */

public class TwoLinkBinTree<E> {
	public static class TreeNode
	{
		Object data;
		TreeNode left;
		TreeNode right;
		public TreeNode()
		{
		}
		public TreeNode(Object data)
		{
			this.data = data;
		}
		public TreeNode(Object data,TreeNode left,TreeNode right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
			// this.parent = parent; ʵ�����������ʱ����Ҫ��ӵĸ��ڵ�;j
		}
	}
	private TreeNode root;
	public TwoLinkBinTree()
	{
		this.root = new TreeNode();
	}
	public TwoLinkBinTree(E data)
	{
		this.root = new TreeNode(data);
	}
	public TreeNode addNode(TreeNode parent, E data,boolean isLeft)
	{
		if(parent == null)
		{
			throw new RuntimeException(parent + "�ڵ�Ϊnull���޷�����ӽڵ�");
		}
		if(isLeft && parent.left != null)
		{
			throw new RuntimeException(parent +"�ýڵ��������ӽڵ㣬����������ӽڵ�");
		}
		if(!isLeft && parent.right != null)
		{
			throw new RuntimeException(parent +"�ýڵ��������ӽڵ㣬����������ӽڵ�");
		}
		TreeNode newNode = new TreeNode(data);
		if(isLeft)
		{
			parent.right = newNode;
		}
		return newNode;
	}
	public boolean empty()
	{
		return root.data == null;
	}
	public TreeNode root()
	{
		if(empty())
		{
			throw new RuntimeException("��Ϊ�գ��޷����ʸ��ڵ�");
		}
		return root;
	}
	public E parent(TreeNode node)
	{
		return null;
	}
	public E leftChild(TreeNode parent)
	{
		if(parent == null)
		{
			throw new RuntimeException(parent + "�ڵ�Ϊ�գ��޷�����ӽڵ�");
		}
		return parent.left == null ? null : (E)parent.left.data;
	}
	public E rightChild(TreeNode parent)
	{
		if(parent == null)
		{
			throw new RuntimeException(parent + "�ڵ�Ϊ�գ��޷�����ӽڵ�");
		}
		return parent.right == null ? null : (E)parent.right.data;
	}
	public int deep()
	{
		return deep(root);
	}
	private int deep(TreeNode node)
	{
		if(node == null)
		{
			return 0;
		}
		if(node.left == null && node.right == null)
		{
			return 1;
		}
		else
		{
			int leftDeep = deep(node.left);
			int rightDeep = deep(node.right);
			int max = leftDeep > rightDeep ? leftDeep : rightDeep;
			return max + 1;
		}
	}

}
