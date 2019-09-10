package java0902;

import java.util.Date;

public class CalEx03 {
	/*
	public static void main(String[] args)  {

		Class c ;
		Object obj;
		try {
			c=Class.forName("java.util.Date");		// 클래스이름 문자열에 해당되는 클래스 반환
			obj = c.newInstance();					// new ~ : c가 돌려주는 객체를 Object로 담고
			if(obj instanceof Date) {				// 객체가 Date 타입이 맞는지 확인
				Date d = (Date)obj;					// 형변환해서 새로 만들기
				System.out.println(d);
			}
			if(obj instanceof Integer) {
				Integer i = (Integer)obj;
				// 형변환후 원하는 기능 구현
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}





	}*/
	public static void main(String[] args) throws Exception {

		Class c =Class.forName("java.util.Date");
		Object obj = c.newInstance();
		if(obj instanceof Date) {				// 객체가 Date 타입이 맞는지 확인
			Date d = (Date)obj;					// 형변환해서 새로 만들기
			System.out.println(d);
		}
		if(obj instanceof Integer) {
			Integer i = (Integer)obj;
			// 형변환후 원하는 기능 구현
		}
	}


}

