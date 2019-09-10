package javaTest.java09;
import java.util.Date;
import java.util.Calendar;
class DateEx1{
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}
}

