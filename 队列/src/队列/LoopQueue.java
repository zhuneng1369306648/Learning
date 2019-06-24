package 队列;

import java.util.Arrays;

public class LoopQueue<T> {
	private int DEFAULT_SIZE = 10;
	private int capacity;
	private Object[] elementData;
	private int front = 0;
	private int rear = 0;
	public LoopQueue()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	public LoopQueue(T element) {
		this();
		elementData[0] = element;
		rear++;
	}
	//以指定长度的数组来创建循环队列
	public LoopQueue(T element , int initSize)
	{
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		rear++;
	}
	//获取循环队列的大小
	public int length()
	{
		if(empty())
		{
			return 0;
		}
		return rear > front ? rear - front : capacity - (front - rear);
	}
	public void add(T element)
	{
		if(rear == front && elementData[front] != null)
		{
			throw new IndexOutOfBoundsException("队列已满的异常");
		}
		elementData[rear++] = element;
		//如果rear已经到头，则砖头
		rear = rear == capacity ? 0 : rear;
	}
	//移除队列
	public T remove()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("空队列异常");
		}
		T oldValue = (T)elementData[front];
		elementData[front++] = null;
		//如果front已经到头，则转头
		front = front == capacity ? 0 : front;
		return oldValue;
	}
	public T element()
	{
		if(empty())
		{
			throw new IndexOutOfBoundsException("空队列异常");
		}
		return (T)elementData[front];
	}
	public boolean empty()
	{
		return rear == front && elementData[rear] == null;
	}
	public void clear()
	{
		Arrays.fill(elementData, null);//arrays.fill(a1.value)a1是一个数组变量，value是一个a1钟数据元素类型的值

		front = 0;
		rear = 0;
	}
	public String toString()
	{
		if(empty())
		{
			return "[]";
		}
		else
		{
			if(front<rear)
			{
				StringBuilder sb = new StringBuilder("[");
				for(int i = front;i<rear;i++)
				{
					sb.append(elementData[i].toString()+",");//append在被选元素的结尾（任然在内部）插入指定类容
				}
				int len = sb.length();
				return sb.delete(len-2, len).append("]").toString();
			}
			else
			{
				StringBuilder sb = new StringBuilder("[");
				for(int i =front;i<capacity;i++)
				{
					sb.append(elementData[i].toString()+",");
				}
				for(int i =0;i<rear;i++)
				{
					sb.append(elementData[i].toString()+",");
				}
				int len = sb.length();
				return sb.delete(len-2,len).append("]").toString();
			}
		}
	}

}
