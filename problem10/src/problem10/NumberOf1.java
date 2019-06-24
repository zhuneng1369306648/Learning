package problem10;
/*
 * 面试题10：二进制中1的个数
 * 实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如9的二进制是1001，则输出2。
 * 位运算相关知识：位运算共5种，与(&)是同时为1才为1，或(|)是有一个为1就是1，异或(^)是不相同为1。
 * 左移运算符m<<n表示把m左移n位，最左边的n位被丢弃，同时在最右边补n个0。
 * 右移运算符m>>n表示m右移n位，最右边n位丢弃，注意，如果数字是一个无符号数值，则用0填补最左边的n位。如果是有符号数值，如正，左边补n个0，负数补n个1。
 * 思路1：先判断二进制表示的最右1位是不是1，把整数和1做与运算即可，然后右移一位，再判断，直到整数变为0。
 * 把整数右移一位和把整数除以2在数学上是等价的但是位运算效率最高，但是思路1可能会陷入死循环，如输入一个负数0x8000，右移之后并不是0x4000，而是0xC000，因为负数移位后要补1，如果循环下去会变成0xFFFF。
 * 思路2：为了避免死循环就要避免右移，我们首先把数字和1做与运算，判断它最低位是不是1，接着把1左移一位得到2，在和输入数与运算，节能判断次低位是不是1，反复左移即可。
 * 思路3：思路2中输入的数的二进制表示有几位，程序就会循环多少次，改进的思路3是二进制里有几个1就循环几次。首先记住一个常用做法：把一个整数减去1之后再和原来的整数做位与运算，得到的结果相当于把整数二进制表示中的最右边一个1变成0。
 * 基于上述做法，一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作。
 * 相关题目1：用一条语句判断一个整数是不是2的整数次方。一个整数如果是2的整数次方，那么他的二进制表示中有且仅有一位是1，根据以上分析，把这个数减去1之后再和他自己做与运算，这个整数中唯一的1就会变成0。
 * 相关题目2：两个整数m和n，计算需要改变m的二进制表示中的多少位才能得到n。比如10表示为1010，13表示为1101，则改变1010的3位才能得到1101。解决思路是，先求这两个数的异或，然后统计异或结果中1的个数。
 */
/*public class NumberOf1 {
	static Integer numberof1(int number){
		int count = 0;
		while(number != 0){
			number = (number - 1) & number;
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println(numberof1(10));
	}
}
public class NumberOf1{
	static Integer numberof1(int number) {
		int count = 0;
		while(number !=0) {
			number = (number-1) &number;
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println(numberof1(9));
	}
}*/
//题目2
public class NumberOf1{
	static boolean numberof1(int number) {
		if(((number-1)&number)==0)
			return true;
		return false;
	}
	public static void main(String[] args){
		System.out.println(numberof1(8));
	}
}
