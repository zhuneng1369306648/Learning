package day130;

import java.util.Properties;

/*
 * */

public class Demo1 {
public static void main(String[] args) {
	int[] srcArr = {10,12,14,16};
	int[] destArr =new int[4];
	System.arraycopy(srcArr, 2, destArr, 1, 2);
	Properties properties = System.getProperties();
	//properties.list(System.out);
	String value = System.getProperty("os.name");
	System.out.println(value);
	System.out.println();
}
}
