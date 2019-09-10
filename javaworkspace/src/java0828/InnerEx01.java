package java0828;

// 외부클래스
class A1{
	A1(){ System.out.println("A객체 생성");}
	// 인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B객체 생성");}
		int x;
		void func1() {
			System.out.println("B클레스 메서드 실행");
		}
		//static X
		//static int y;
		//static void func2(){}
	}
	static class C{
		C(){System.out.println("C객체 생성");}
		int x;
		void func1() {System.out.println("C클래스 메서드 실행");}
		static int y;
		static void func2(){System.out.println("C클래스 static 메서드 실행");}
	}
	void method() {
		class D{
			D(){System.out.println("D객체 생성");}
			int x;
			void func1() {
				System.out.println("D클래스 메서드 실행");
			}
			//static X
			//static int y;
			//static void func2(){}
		}
		D d = new D();
		System.out.println("d.x: "+d.x);
		d.x=1000;
		System.out.println("d.x: "+d.x);
		d.func1();
	}
}

public class InnerEx01 {
	public static void main(String[] args) {
		
		//인스턴스 멤버 클래스 객체 생성
		A1 a = new A1();
		A1.B b = a.new B();
		System.out.println("b.x :"+b.x);
		b.x=10;
		System.out.println("b.x :"+b.x);
		b.func1();
		System.out.println("----------------------");
		// static 멤버 클래스 객체 생성
		A1.C c=new A1.C();
		System.out.println("c.x :"+c.x);
		c.x=100;
		System.out.println("c.x :"+c.x);
		c.func1();
		System.out.println("A.C.y: "+A1.C.y);
		A1.C.y = 200;
		System.out.println("A.C.y: "+A1.C.y);
		A1.C.func2();
		System.out.println("----------------------");
		// 로컬 클래스 사용
		a.method();

	}
}
