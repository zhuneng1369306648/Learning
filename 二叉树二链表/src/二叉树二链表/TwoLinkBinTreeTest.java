package ������������;

public class TwoLinkBinTreeTest {
	public static void main(String[] args)
	{
		TwoLinkBinTree<String> binTree = new TwoLinkBinTree("���ڵ�");
		TwoLinkBinTree.TreeNode tn1 = binTree.addNode(binTree.root(), "�ڶ�����ڵ�", true);
		TwoLinkBinTree.TreeNode tn2 = binTree.addNode(binTree.root(), "�ڶ����ҽڵ�",false);
		TwoLinkBinTree.TreeNode tn3 = binTree.addNode(binTree.root(), "��������ڵ�", true);
		TwoLinkBinTree.TreeNode tn4 = binTree.addNode(binTree.root(), "��������ڵ�", false);
		TwoLinkBinTree.TreeNode tn5 = binTree.addNode(binTree.root(), "���Ĳ���ڵ�", true);
		System.out.println("tn2�����ӽڵ�" + binTree.leftChild(tn2));
		System.out.println("tn2�����ӽڵ�" + binTree.rightChild(tn2));
		System.out.println(binTree.deep());
	}

}
