package java0902;

import java.util.Date;

public class CalEx03 {
	/*
	public static void main(String[] args)  {

		Class c ;
		Object obj;
		try {
			c=Class.forName("java.util.Date");		// Ŭ�����̸� ���ڿ��� �ش�Ǵ� Ŭ���� ��ȯ
			obj = c.newInstance();					// new ~ : c�� �����ִ� ��ü�� Object�� ���
			if(obj instanceof Date) {				// ��ü�� Date Ÿ���� �´��� Ȯ��
				Date d = (Date)obj;					// ����ȯ�ؼ� ���� �����
				System.out.println(d);
			}
			if(obj instanceof Integer) {
				Integer i = (Integer)obj;
				// ����ȯ�� ���ϴ� ��� ����
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}





	}*/
	public static void main(String[] args) throws Exception {

		Class c =Class.forName("java.util.Date");
		Object obj = c.newInstance();
		if(obj instanceof Date) {				// ��ü�� Date Ÿ���� �´��� Ȯ��
			Date d = (Date)obj;					// ����ȯ�ؼ� ���� �����
			System.out.println(d);
		}
		if(obj instanceof Integer) {
			Integer i = (Integer)obj;
			// ����ȯ�� ���ϴ� ��� ����
		}
	}


}

