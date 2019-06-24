package day130;

import java.util.Random;

public class Demo5 {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	Random random = new Random();
    	char[] arr = {'ÖÐ','¹ú','´«','Q','E','R','r'};
    	for(int i=0;i<4;i++) {
    		int index = random.nextInt(arr.length);
    		sb.append(arr[index]);
    	}
    	System.out.println(sb);
	
    }
}
