package day10;

public class Test14 {
	public static void reorderOddEven(int[] arr) {
		if(arr==null || arr.length < 2) {
			return;
		}
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			while(start<end && arr[start]%2 !=0) {
				start++;
			}
			while(start<end && arr[end]%2 == 0) {
				end--;
			}
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
		}
	}
	public static void printArray(int[] arr) {
		if(arr != null && arr.length >0) {
			for(int i : arr) {
				System.out.println(i+"");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8};
		reorderOddEven(array);
		printArray(array);
	}

}
