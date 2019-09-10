package java0904;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//키, 값 저장
		prop.setProperty("트레비", "탄산수");
		prop.setProperty("Altoids", "민트사탕");
		prop.setProperty("아이폰", "Xs");
		prop.setProperty("자바", "OOP");
		
		// prop에 저장된 요소는 Enumeration을 이용해서 출력
		Enumeration e= prop.propertyNames();
		while(e.hasMoreElements()) {
			// Object o = e.nextElement(); 
			String str =(String)e.nextElement();
			System.out.println(str+"="+prop.getProperty(str));
		}
		// 기존에 지정된 키가 존재하면 값이 덮어쓰기 된다.
		prop.setProperty("트래비", "스파클링 워터");
		System.out.println("트래비 : "+prop.getProperty("트래비"));
	}
}
