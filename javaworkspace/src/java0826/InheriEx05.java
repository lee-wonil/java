package java0826;

class A1{
	//�⺻������
	public A1() {
		System.out.println("������ A");		
	}
	
	public A1(int x) {
		System.out.println("������ A - param");
	}
}
class B1 extends A1{
	public B1() {
		
		System.out.println("������ B");
	}
	public B1(int x) {
		//super() : �⺻������ ȣ��		
		super(x);
		System.out.println("������ B - param");
		
	}
}


public class InheriEx05 {
	public static void main(String[] args) {
		//B1 b = new B1();
		B1 b2 = new B1(10);
	}
}
