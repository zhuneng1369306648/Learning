package 链表;

import java.util.Arrays;

public class SequenceStack<T> {
	private int DEFAULT_SIZE = 10;
	private int capacity;
	private int capacityIncrement = 0;
	private Object[] elementData;
	private int size = 0;
	public SequenceStack()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	public SequenceStack(T element) //初始化元素来创建栈
	{
		this();
		elementData[0] = element;
		size++;
	}
	public SequenceStack(T element,int initSize)
	{//以指定长度的数组来创建顺序栈
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		size++;
	}
	//指定当顺序栈底层数组的长度不够是，底层数组每次真假的长度
	public SequenceStack(T element, int initSize,int capacityIncrement)
	{
		this.capacity = initSize;
		this.capacityIncrement = capacityIncrement;
		elementData = new Object[capacity];
		elementData[0] = element;
		size++;
	}
	public int length()   //获取数组长度
	{
		return size;
	}
	public void push(T element)
	{
		ensureCapacity(size + 1);
		elementData[size++] = element;
	}
	private void ensureCapacity(int minCapacity)
	{
		if(minCapacity > capacity)
		{
			if(capacityIncrement > 0)
				{
					while(capacity < minCapacity)
					{
						capacity += capacityIncrement;
					}
				}
			else
			{
				while(capacity < minCapacity)
				{
					capacity <<= 1;
				}
			}
			elementData = Arrays.copyOf(elementData,capacity);
			}
		}
	public T pop()
	{
		T oldValue = (T)elementData[size - 1];
		elementData[--size] = null;
		return oldValue;
	}
	public T peek()
	{
		return (T)elementData[size - 1];
	}
	public boolean empty()
	{
		return size == 0;
	}
	public void clear()
	{
		Arrays.fill(elementData, null);
		size = 0;
	}
	public String toString()
	{
		if (size == 0)
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for(int i = size - 1; i > -1;i--)
			{
				sb.append(elementData[i].toString() + ",");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();
		}
	}

}
