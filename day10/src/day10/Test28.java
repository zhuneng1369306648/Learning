package day10;

public class Test28 {
	public static void permutation(char[] chars) {
		if(chars==null || chars.length <1) {
			return;
		}
		permutation(chars,0);
	}
	public static void permutation(char[] chars,int begin) {
		if(chars.length - 1 == begin) {
			System.out.println(new String(chars)+"");
		}else {
			char tmp;
			for(int i=begin;i<chars.length;i++) {
				tmp=chars[begin];
				chars[begin]=chars[i];
				chars[i]=tmp;
				permutation(chars,begin+1);
			}
		}
	}
	public static void main(String[] args) {
		char[] c1= {'a','b','c'};
		permutation(c1);
	}

}
