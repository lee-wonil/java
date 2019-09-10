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
	*///이런식으로 선언해도 상관이 없으나 만약 Person을 상속받는 객체가 100개가 넘어가는 경우 똑같은 역할을 하는 메소드도 100개를 생성해야 되는 어려운 점이 있다.
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
		//Object는 최상위 클래스로 모든 타입이 대입가능한 타입.
		Object obj1 = new Person();
		print(obj1);
		//System.out.println(obj1.x); // Object 클래스에는 x라는 변수가 정의가 되어 있지 않기 때문에 사용이 불가능 하다.
		Person p=(Person)obj1;// 하지만 Object 클래스가 현재 Person()으로 정의 되어 있으므로 Person 객체를 새로 생성하는 경우에는 사용이 가능하다.
		System.out.println(p.x);
		
		Object obj2 = new Researcher();
//		Student s1 = (Student)obj2;	// 실제 객체 타입과 맞지않은 형변환으로 에러
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
