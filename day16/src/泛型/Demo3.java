package 泛型;

import java.util.ArrayList;

class MyArrays<T>{
	public void reverse(T[] arr) {
		for(int startIndex = 0,endIndex = arr.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			T temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
	public String toString(T[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				sb.append("{"+arr[i]+",");
			}else if(i==arr.length-1) {
				sb.append(arr[i]+"]");
			}else {
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	public static <T>void print(T[] t){
		
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Integer[] arr = {10,12,14,19};
		MyArrays<Integer> tool = new MyArrays<Integer>();
		tool.reverse(arr);
		System.out.println("数组的元素："+tool.toString(arr));
		
		MyArrays<String> tool2 = new MyArrays<String>();
		String[] arr2 = {"aaa","bbb","ccc"};
		tool2.reverse(arr2);
				
		
		ArrayList<String> list = new ArrayList<String>();
		
	}

}
