package ˳�������;

public class ArrayBinTreeTest {
	public static void main(String[] args)
	{
		ArrayBinTree<String> binTree = 
				new ArrayBinTree<String>(4,"��");
		binTree.add(0, "�ڶ������ӽڵ�", false);
		binTree.add(2, "���������ӽڵ�", false);
		binTree.add(6, "���Ĳ����ӽڵ�", false);
		System.out.println(binTree);
		
	}

}
