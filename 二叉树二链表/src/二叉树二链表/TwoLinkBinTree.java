package 二叉树二链表;
/*一般情况，二叉链表二叉树访问父节点不方便，所以将二叉链表扩展成三叉链表，
 * 每个节点记住左右节点和父节点
 * class Node
 * {
 * T data;
 * Node left;
 * Node right;
 * Node parent;
 * }
 * 这样添加子节点也非常容易
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
			// this.parent = parent; 实现三叉链表的时候需要添加的父节点;j
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
			throw new RuntimeException(parent + "节点为null，无法添加子节点");
		}
		if(isLeft && parent.left != null)
		{
			throw new RuntimeException(parent +"该节点已有左子节点，无需添加座子节点");
		}
		if(!isLeft && parent.right != null)
		{
			throw new RuntimeException(parent +"该节点已有右子节点，无序添加右子节点");
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
			throw new RuntimeException("树为空，无法访问根节点");
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
			throw new RuntimeException(parent + "节点为空，无法添加子节点");
		}
		return parent.left == null ? null : (E)parent.left.data;
	}
	public E rightChild(TreeNode parent)
	{
		if(parent == null)
		{
			throw new RuntimeException(parent + "节点为空，无法添加子节点");
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
