package ·ºÐÍ;

import java.util.ArrayList;

public class MyUtil {
	
	public static ArrayList getList(){
		
		return new ArrayList();
	}
	
	public static void print(ArrayList list){
	
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	
}