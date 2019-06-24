package day10;

public class Test08 {
	public static int min(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			throw new RuntimeException("invalid input");
		}
		int lo = 0;
		int hi = numbers.length - 1;
		int mi = lo;
		while(numbers[lo] >= numbers[hi]) {
			if(hi-lo==1) {
				return numbers[hi];
			}
			mi = lo +(hi-lo)/2;
			if(numbers[mi]==numbers[lo]&&numbers[hi]==numbers[mi]) {
				return minlnorder(numbers,lo,hi);
			}
			if(numbers[mi]>=numbers[hi]) {
				lo=mi;
			}
			else if(numbers[mi] <=numbers[hi]) {
				hi = mi;
			}
		}
		return numbers[hi];
	}
	public static int minlnorder(int[] numbers, int start,int end) {
		int result = numbers[start];
		for(int i=start+1;i<=end;i++) {
			if(result>numbers[i]) {
				result = numbers[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array1 = {3,4,5,1,2};
		System.out.println(min(array1));
	}

}
