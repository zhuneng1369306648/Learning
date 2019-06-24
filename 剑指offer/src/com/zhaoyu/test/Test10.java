package com.zhaoyu.test;

public class Test10 {
	 /**
     * 请实现一个函数， 输入一个整数，输出该数二进制表示中1的个数。
     * 例如把9表示成二进制是1001 ，有2位是1. 因此如果输入9，该出2。
     *
     * @param n 待的数字
     * @return 数字中二进制表表的1的数目
     */
	public static int numberOfOne(int n) {
		//记录数字中1的位数
		int result = 0;
		//在java中，int整形占4个直接，总计32位
		//对每一个位置进行求与操作，再累加
		for(int i=0;i<32;i++) {
			result += (n & 1);
			n>>>=1; // 无符号右移
		}
		//返回求得的结果
		return result;
	}
	public static int numberOfOne2(int n) {
		int result = 0;
		while(n != 0) {
			result++;
			n = (n-1) & n;
		}
		return result;
	}
	 public static void main(String[] args) {
	        System.out.println(numberOfOne(0B00000000_00000000_00000000_00000000)); // 0
	        System.out.println(numberOfOne(0B00000000_00000000_00000000_00000001)); // 1
	        System.out.println(numberOfOne(0B11111111_11111111_11111111_11111111)); // -1
	        System.out.println(0B01111111_11111111_11111111_11111111 == Integer.MAX_VALUE);
	        System.out.println(numberOfOne(0B01111111_11111111_11111111_11111111)); // Integer.MAX_VALUE
	        System.out.println(0B10000000_00000000_00000000_00000000 == Integer.MIN_VALUE);
	        System.out.println(numberOfOne(0B10000000_00000000_00000000_00000000)); // Integer.MIN_VALUE

	        System.out.println("");
	        System.out.println(numberOfOne2(0B00000000_00000000_00000000_00000000)); // 0
	        System.out.println(numberOfOne2(0B00000000_00000000_00000000_00000001)); // 1
	        System.out.println(numberOfOne2(0B11111111_11111111_11111111_11111111)); // -1
	        System.out.println(numberOfOne2(0B01111111_11111111_11111111_11111111)); // Integer.MAX_VALUE
	        System.out.println(numberOfOne2(0B10000000_00000000_00000000_00000000)); // Integer.MIN_VALUE
	    }

}
