package ֱ��ѡ������;

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
public class SelectSort
{
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		for(int i = 0;i<arrayLength - 1;i++)//���ν���n-1�˱Ƚϣ���i�˱ȽϽ���i���������iλ����
		{
			int minIndex = i;//��I������ֻ��Ҫ������������ݱȽ�
			for(int j = i+1;j<arrayLength;j++) {
				if(data[i].compareTo(data[j])>0)
				{
					DataWrap tem = data[i];
					data[i] = data[j];
					data[j] = tem;
				}
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
