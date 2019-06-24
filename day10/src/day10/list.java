package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class list {
	public String random;
	public Set<?> stringSet;
	
	public void testSortInteger() {
		List<Integer> intergerList = new ArrayList<Integer>();
		Random rd = new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k = rd.nextInt(100);
			}while(intergerList.contains(k));
			intergerList.add(k);
		}
		for(Integer intg:intergerList) {
			System.out.println(intg);
		}
		System.out.println("");
		Collections.sort(intergerList);
		for(Integer intg:intergerList) {
			System.out.println(intg);
		}
	}
	 public void testStringSort(){
	        List<String> stringList = new ArrayList<String>();
	        stringList.add("Google");
	        stringList.add("Apple");
	        stringList.add("Microsoft");
	        Collections.sort(stringList);
	        for (String s:stringList
	             ) {
	            System.out.println(s);
	        }
	      for (int i = 0 ; i<stringList.size();i++) {
	            System.out.println(stringList.get(i));
	        }
	    }
	 public void testStringIntSort(){
	        Random rd = new Random();
	        //定义一个随机数的数组
	        char[] chr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
	                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
	                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	        //使用字符串缓冲区用来把数组中的字符变成字符串添加到缓冲区中
//	        StringBuilder sb = new StringBuilder();
//	        //取十条数据
//	        for (int i = 0; i<10;i++){
//	            //每条字符串长度不超过10
//	                for (int y = 0;y<10;y++) {
//	                    if (y!=9)
//	                        sb.append(chr[rd.nextInt(62)]);
//	                    else
//	                        sb.append(chr[rd.nextInt(62)]+",");
//	                }
//	        }
//	        String string = sb.toString();//转换成字符串
//	        String[] arrayS = string.split(",");
//	        stringSet = new TreeSet<Object>(Arrays.asList(arrayS));//保证字符串不重复，但是会丢数据！
//	        Iterator it = contains.iterator();
//	        while (it.hasNext()){
//	            random = (String) it.next();
//	            System.out.println(random);
//	        }
	        StringBuilder sb = new StringBuilder();
	        List<String> contains = new ArrayList<String>();
	        //取十条数据
	        for (int i = 0; i<10;i++){
	            //每条字符串长度不超过10
	            for (int y = rd.nextInt(10);y<10;y++) {
	                if (y==9)
	                    contains.add(sb.append(chr[rd.nextInt(62)]).toString());
	                sb.append(chr[rd.nextInt(62)]);
	            }
	            sb.delete(0,sb.length());
	        }
	        Collections.sort(contains);
	        for (String s:contains){
	            System.out.println(s);
	        }


	    }
	    public static void main(String[] args) {
	        list als = new list();
//	        als.testSortInteger();
	        als.testStringSort();
	       // als.testStringIntSort();
	    }
	}
