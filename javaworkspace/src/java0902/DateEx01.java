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
		// ��¥, �ð����� ����Ҷ� ����ϴ� ������ �������ִ� Ŭ����
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy�� MM�� dd�� �Դϴ�.");
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
	}
}
