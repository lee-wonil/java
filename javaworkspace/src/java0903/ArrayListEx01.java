package java0903;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		a.add("hello");
		a.add("java");
		//a.add(10);		//String 만 저장가능
		a.add(null);
		a.add(1, "hahaha");
		//a.add(5, "test");	// indexoutofBounds
		System.out.println(a);
		String s =a.get(1);
		System.out.println(s);
		int size =a.size();
		System.out.println(size);
		a.remove(1);
		System.out.println(a);
		a.remove("hello");		// 문자열 객체 다른 객체 new 클래스명()
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}
}
