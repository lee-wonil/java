package java0828;

// �ܺ�Ŭ����
class A1{
	A1(){ System.out.println("A��ü ����");}
	// �ν��Ͻ� ��� Ŭ����
	class B{
		B(){System.out.println("B��ü ����");}
		int x;
		void func1() {
			System.out.println("BŬ���� �޼��� ����");
		}
		//static X
		//static int y;
		//static void func2(){}
	}
	static class C{
		C(){System.out.println("C��ü ����");}
		int x;
		void func1() {System.out.println("CŬ���� �޼��� ����");}
		static int y;
		static void func2(){System.out.println("CŬ���� static �޼��� ����");}
	}
	void method() {
		class D{
			D(){System.out.println("D��ü ����");}
			int x;
			void func1() {
				System.out.println("DŬ���� �޼��� ����");
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
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A1 a = new A1();
		A1.B b = a.new B();
		System.out.println("b.x :"+b.x);
		b.x=10;
		System.out.println("b.x :"+b.x);
		b.func1();
		System.out.println("----------------------");
		// static ��� Ŭ���� ��ü ����
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
		// ���� Ŭ���� ���
		a.method();

	}
}
