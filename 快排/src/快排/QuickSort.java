package 快排;

class DataWrap implements Comparable<DataWrap>{//定义一个数据包装类
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
	public int compareTo(DataWrap dw)//根据datawrap实例变量来决定两个datawrap的大小
	{
		return this.data > dw.data ?1: (this.data == dw.data ? 0 : -1);
	}
}

public class QuickSort {
	private static void swap(DataWrap[] data,int i,int j)
	{
		DataWrap tem;
		tem = data[i];
		data[i] = data[j];
		data[j] = tem;
	}
	private static void subSort(DataWrap[] data,int start,int end)
	{
		if(start< end)
		{
			DataWrap base = data[start];
			int i = start;
			int j = end+ 1;
			while(true)
			{
				while(i<end &&data[++i].compareTo(base) <= 0);
				while(j>start && data[--j].compareTo(base) >= 0);
				if(i<j)
				{
					swap(data,i,j);
				}
				else
				{
					break;  
				}
			}
			swap(data,start,j);
			subSort(data,start,j-1);
			subSort(data,j+1,end);
		}
	}
	public static void quickSort(DataWrap[] data)
	{
		subSort(data, 0, data.length -1);
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
		quickSort(data);
		System.out.println("排序之后 \n"+java.util.Arrays.toString(data));
		}

}
