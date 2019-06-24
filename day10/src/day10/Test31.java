package day10;

public class Test31 {
	public static int findGreatestSumOfSubArray(int[] arr) {
		if(arr == null || arr.length <1) {
			throw new IllegalArgumentException("Array must contain an element");
		}
		int max = Integer.MIN_VALUE;
		int curMax = 0;
		for(int i:arr) {
			if(curMax <=0) {
				curMax = i;
			}else {
				curMax +=i;
			}
			if(max<curMax) {
				max=curMax;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] data= {1,-1,3,10,-4,4,8,-5};
		System.out.println(findGreatestSumOfSubArray(data));
	}

}
