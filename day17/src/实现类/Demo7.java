package 实现类;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

class Book{
	String name;
	String date;
	public Book(String name,String date) {
		super();
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[书名"+this.name+"出版日期"+this.date+"]";
	}

}
class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.date.compareTo(o1.date)-o2.date.compareTo(o2.date);
	}
	
}

public class Demo7 {
	public static void main(String[] args) {
		TreeMap<Book,String> map = new TreeMap<Book,String>();
		Date date = new Date();
        MyComparator comparator = new MyComparator();
		
		TreeMap<Book, String> tree = new TreeMap<Book, String>(comparator);
		tree.put(new Book("西游记","1998-08-02"), "001");
		System.out.println(tree);
	}

}

