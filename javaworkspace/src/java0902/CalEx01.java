package java0902;

import java.util.Calendar;

public class CalEx01 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		//�⵵�� �� �˾Ƴ���
		int year = now.get(Calendar.YEAR);
		System.out.println(year);		//�⵵
		int month = now.get(Calendar.MONTH);
		System.out.println(month+1);
		
		

	}

}
