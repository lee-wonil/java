package java0819;
//#1.클래스 만들기 : 틀을 만든다.
class Person{
	//변수 : 속성 : 명사
	String name="";
	int age=0;
	//메서드 : 기능 : 동사
	void walk() {
		System.out.println("걸어가자");
	}
	void eat() {
		System.out.println("먹자");
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	
}

public class ClassEx02 {

	//메서드 : 메인메서드 : 프로그램실행시 가장 먼저 실행되는 메서드
	//		->이 작업 파일 실행시, 객체 생성하고 결과를 확인해보려면 
	//			메인메서드 안에서 만들어야 한다.
	public static void main(String[] args) {
		//#2. 객체 생성 : 프로그램실행시 자동호출되어 동작하는 main메소드에다가 객체 생성하기.		
		Person p1 = new Person();
		//#3. 사용		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.name="홍길동";
		p1.age=10;
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);		
		p1.walk();
		p1.eat();
	}

}
