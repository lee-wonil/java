package java0902;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalEx02 {
	public static void main(String[] args) {
		
		// 문제.(옵션)오늘부터 크리스마스까지 D-day 계산기 만들기.
		
		
		final String [] DAY_OF_WEEK={"","일","월","화","수","목","금","토"};
		Calendar date1= Calendar.getInstance();		// 현재 수업지작일 지정
		Calendar date2= Calendar.getInstance();
		date1.set(2019,7,6);
		System.out.println("date1 : "+ toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);	
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm");
		//sdf.format(new Date());
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일 ";
	}
	
}
