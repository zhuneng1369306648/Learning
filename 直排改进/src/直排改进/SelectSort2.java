package ֱ�ŸĽ�;
/*
 * �Ľ��ľ��ǲ���һ�ҵ��Ǹ�С�����ͽ�������ѭ��һ���ҵ���С�������������minindex�����ֵ��Ȼ���ٽ�����
 * ʡ����ÿ��һ�ҵ�С������ʱ��Ľ������裬����ֱ��ѡ�������ǲ��ȶ���
*/

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

public class SelectSort2 {
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		for(int i =0;i<arrayLength-1;i++)
		{
			int minIndex = i;
			for(int j = i+1;j<arrayLength;j++)
			{
				if(data[minIndex].compareTo(data[j])>0)
				{
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				DataWrap tem = data[i];
				data[i] = data[minIndex];
				data[minIndex] = tem;
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
				new DataWrap(98,""),
				new DataWrap(30,""),
				new DataWrap(30,"*"),
				new DataWrap(68,""),
				new DataWrap(78,""),
				new DataWrap(62,""),
				};
		selectSort(data);
		System.out.println("����֮�� \n"+java.util.Arrays.toString(data));
		}

}
