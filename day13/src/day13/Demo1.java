package day13;
/*
 * */
public class Demo1 {
	public static void main(String[] args) {
	    StringBuffer sb = new StringBuffer();
	    sb.append("abc");
	    System.out.println(sb);
	    sb.insert(0, "fdad");
	    System.out.println(sb);
	    //删除
	    sb.delete(2, 4);
	    System.out.println(sb);//删除的时候也是包头不报为
	    sb.deleteCharAt(2);
	    System.out.println(sb);
	    sb.replace(2, 4, "hello");
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);
	    sb.setCharAt(1,'红');
	    System.out.println(sb);
	    
	}

}
