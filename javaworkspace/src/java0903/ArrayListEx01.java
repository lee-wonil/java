package java0903;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		a.add("hello");
		a.add("java");
		//a.add(10);		//String �� ���尡��
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
		a.remove("hello");		// ���ڿ� ��ü �ٸ� ��ü new Ŭ������()
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}
}
