package javaTest.java09;
import java.util.Date;
import java.text.SimpleDateFormat;
class DateFormatEx1{
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM dd일 E요일");

		System.out.println(sdf1.format(today));	
		System.out.println(sdf2.format(today));

	}
}