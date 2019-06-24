package 直接选择排序;

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
public class SelectSort
{
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 0;i<arrayLength - 1;i++)//依次进行n-1趟比较，第i趟比较将第i大的数放在i位置上
		{
			int minIndex = i;//第I个数据只需要和他后面的数据比较
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
	System.out.println("排序之后 \n"+java.util.Arrays.toString(data));
	}
}
