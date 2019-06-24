package 直排改进;
/*
 * 改进的就是不是一找到那个小的数就交换，先循环一次找到最小的数，如果不是minindex保存的值，然后再交换，
 * 省略了每次一找到小的数的时候的交换步骤，但是直接选择排序还是不稳定的
*/

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

public class SelectSort2 {
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("开始排序");
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
		System.out.println("排序之后 \n"+java.util.Arrays.toString(data));
		}

}
