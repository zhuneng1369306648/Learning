package day12;

public class Demo6 {
	public static void main(String[] args) {
		String str = "    nihao";
		System.out.println(myTrim(str));
	}
	public static String myTrim(String str) {
		char[] arr = str.toCharArray();
		int startIndex= 0;
		int endIndex = arr.length-1;
		while(true) {
			if(arr[startIndex]==' ') {
				startIndex++;
			}else {
				break;
			}
		}
		while(true) {
			if(arr[endIndex]==' ') {
				endIndex--;
			}else {
				break;
			}
		}
		return str.substring(startIndex,endIndex+1);
	}

}
