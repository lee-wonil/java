package java0902;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalEx02 {
	public static void main(String[] args) {
		
		// ����.(�ɼ�)���ú��� ũ������������ D-day ���� �����.
		
		
		final String [] DAY_OF_WEEK={"","��","��","ȭ","��","��","��","��"};
		Calendar date1= Calendar.getInstance();		// ���� ���������� ����
		Calendar date2= Calendar.getInstance();
		date1.set(2019,7,6);
		System.out.println("date1 : "+ toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);	
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm");
		//sdf.format(new Date());
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+ date.get(Calendar.DATE)+"�� ";
	}
	
}
