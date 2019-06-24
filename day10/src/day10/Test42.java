package day10;

public class Test42 {
	public static void reverse(char[] data,int start,int end) {
		if(data==null || data.length <1||start<0||end>data.length||start>end) {
			return;
		}
		while(start<end) {
			char tmp = data[start];
			data[start] = data[end];
			data[end] = tmp;
			start++;
			end--;
		}
	}
	public static char[] reverseSentence(char[] data) {
		if(data==null || data.length <1) {
			return data;
		}
		reverse(data,0,data.length-1);
		int start=0;
		int end=0;
		while(start<data.length) {
			if(data[start]==' ') {
				start++;
				end++;
			}else if(end==data.length || data[end]==' ') {
				reverse(data,start,end-1);
				end++;
				start = end;
			}else {
				end++;
			}
		}
		return data;
	}
	
	public static void main(String[] args) {
		test01();
	}
	private static void test01() {
		System.out.println(new String(reverseSentence("I am a student.".toCharArray())));
	}

}
