package java0827;

import java.util.Scanner;

class Person{
	int x = 100;
}
class Student extends Person{}
class Researcher extends Person{int y=200;}
class Professor extends Person{}


public class PolyEx07 {
	/*
	static void print(Student s) {
		System.out.println("Student");
	}
	static void print(Professor p) {
		System.out.println("Professor");
	}
	static void print(Researcher r) {
		System.out.println("Researcher");
	}
	*///�̷������� �����ص� ����� ������ ���� Person�� ��ӹ޴� ��ü�� 100���� �Ѿ�� ��� �Ȱ��� ������ �ϴ� �޼ҵ嵵 100���� �����ؾ� �Ǵ� ����� ���� �ִ�.
	static void print(Object obj) {
		if(obj instanceof Student)	System.out.println("Student");
		else if(obj instanceof Professor)	System.out.println("Professor");
		else if(obj instanceof Researcher)	System.out.println("Researcher");
		else if(obj instanceof Person)	System.out.println("Person");	
	}
	
	public static void main(String[] args) {
		print(new Student());
		print(new Researcher());
		print(new Professor());
		print(new Person());
		//Object�� �ֻ��� Ŭ������ ��� Ÿ���� ���԰����� Ÿ��.
		Object obj1 = new Person();
		print(obj1);
		//System.out.println(obj1.x); // Object Ŭ�������� x��� ������ ���ǰ� �Ǿ� ���� �ʱ� ������ ����� �Ұ��� �ϴ�.
		Person p=(Person)obj1;// ������ Object Ŭ������ ���� Person()���� ���� �Ǿ� �����Ƿ� Person ��ü�� ���� �����ϴ� ��쿡�� ����� �����ϴ�.
		System.out.println(p.x);
		
		Object obj2 = new Researcher();
//		Student s1 = (Student)obj2;	// ���� ��ü Ÿ�԰� �������� ����ȯ���� ����
//		System.out.println(s1.x);
		if(obj2 instanceof Student) {
			Student s = (Student)obj2;
			System.out.println("Student :"+s.x);
		}
		if(obj2 instanceof Researcher) {
			Researcher r = (Researcher)obj2;
			System.out.println("researcher :"+r.y);
		}
		Object obj3 = new Researcher();
		Object obj4 = new Professor();
		Object obj5 = new String();
		Object obj6 = new Scanner(System.in);
	}

}
