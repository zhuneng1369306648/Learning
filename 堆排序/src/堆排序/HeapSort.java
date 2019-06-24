package ������;

class DataWrap implements Comparable<DataWrap>{//����һ�����ݰ�װ��
	int data;
	String flag;
	public DataWrap(int data,String flag)
	{
		this.data = data;
		this.flag = flag;
	}
	public String toString()
	{
		return data + flag;
	}
	public int compareTo(DataWrap dw)//����datawrapʵ����������������datawrap�Ĵ�С
	{
		return this.data > dw.data ?1: (this.data == dw.data ? 0 : -1);
	}
}

public class HeapSort {
	public static void heapSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		for(int i = 0;i<arrayLength - 1;i++)//ѭ������
		{
			builMaxdHeap(data,arrayLength - 1 -i);//����
			swap(data, 0,arrayLength -1 -i);//�����Ѷ������һ��Ԫ��
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	private static void builMaxdHeap(DataWrap[] data, int lastIndex)//���󶥶�
	{
		for(int i = (lastIndex - 1)/2 ;i>=0;i--)
		{//��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ
			int k = i;//k���浱ǰ�����жϵĽڵ�
			while(k*2+1<=lastIndex)//�����ǰk�ڵ���ӽڵ����
			{
				int biggerIndex = 2 *k+1;//k�ڵ�����ӽڵ������
				if(biggerIndex < lastIndex)//���biggerIndexС��lastIndex,�����k�ڵ�����ӽڵ����
				{
					if(data[biggerIndex].compareTo(data[biggerIndex+1])< 0)//������ӽڵ��ֵ�ϴ�
					{
						biggerIndex++;//���Ǽ�¼�ϴ�ڵ������
					}
				}
				if(data[k].compareTo(data[biggerIndex])< 0)
				{
					swap(data,k,biggerIndex);
					k=biggerIndex;
				}
				else
				{
					break;
				}
			}
		}
	}
	private static void swap(DataWrap[] data,int i,int j)
	{
		DataWrap tem = data[i];
		data[i] = data[j];
		data[j] = tem;
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
				new DataWrap(21,""),
				new DataWrap(30,""),
				new DataWrap(49,""),
				new DataWrap(30,"*"),
				new DataWrap(16,""),
				new DataWrap(9,""),
				};
		heapSort(data);
		System.out.println("����֮�� \n"+java.util.Arrays.toString(data));
		}

}
