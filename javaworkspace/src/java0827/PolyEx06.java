package java0827;

class A{
	int x;
	void add() {
		System.out.println("AAA");
	}
}
class B extends A{
	int y;
	@Override
	void add() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUB!");
	}
}


public class PolyEx06 {

	public static void main(String[] args) {
		A a = new B();
		//B b=new A();
		B b = null;		
		if(a instanceof B) {
			System.out.println("����ȯ ����");
			b = (B)a;
		}
		else {
			System.out.println("����ȯ �Ұ���");
		}
		b.add();
		a.add();
		
		
	}

}
