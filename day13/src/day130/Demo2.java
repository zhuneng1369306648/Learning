package day130;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo2 {
	public static void main(String[] args) throws ParseException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String time = dateFormat.format(date);
		System.out.println(time);
		String birthday = "2014Äê12ÔÂ26ÈÕ   11:28:45";
		 Date date2 = dateFormat.parse(birthday);
		 System.out.println(birthday);
	}

}
