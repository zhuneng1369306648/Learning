package day19;

import java.util.ArrayList;
import static java.util.Collections.sort;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(9);
		sort(list);
		System.out.println(list);
	}

}
