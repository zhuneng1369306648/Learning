package 堆排序;

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

public class HeapSort {
	public static void heapSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 0;i<arrayLength - 1;i++)//循环建堆
		{
			builMaxdHeap(data,arrayLength - 1 -i);//建堆
			swap(data, 0,arrayLength -1 -i);//交换堆顶和最后一个元素
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	private static void builMaxdHeap(DataWrap[] data, int lastIndex)//建大顶堆
	{
		for(int i = (lastIndex - 1)/2 ;i>=0;i--)
		{//从lastIndex处节点（最后一个节点）的父节点开始
			int k = i;//k保存当前正在判断的节点
			while(k*2+1<=lastIndex)//如果当前k节点的子节点存在
			{
				int biggerIndex = 2 *k+1;//k节点的左子节点的索引
				if(biggerIndex < lastIndex)//如果biggerIndex小于lastIndex,代表的k节点的右子节点存在
				{
					if(data[biggerIndex].compareTo(data[biggerIndex+1])< 0)//如果右子节点的值较大
					{
						biggerIndex++;//总是记录较大节点的索引
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
		System.out.println("排序之后 \n"+java.util.Arrays.toString(data));
		}

}
