package java0902;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth()+1);
		Date today = new Date(2019,9,20);
		SimpleDateFormat sdf1, sdf2;
		// 날짜, 시간등을 출력할때 출력하는 포맷을 지정해주는 클래스
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 입니다.");
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
	}
}
