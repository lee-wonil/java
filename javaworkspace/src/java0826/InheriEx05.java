package java0826;

class A1{
	//奄沙持失切
	public A1() {
		System.out.println("持失切 A");		
	}
	
	public A1(int x) {
		System.out.println("持失切 A - param");
	}
}
class B1 extends A1{
	public B1() {
		
		System.out.println("持失切 B");
	}
	public B1(int x) {
		//super() : 奄沙持失切 硲窒		
		super(x);
		System.out.println("持失切 B - param");
		
	}
}


public class InheriEx05 {
	public static void main(String[] args) {
		//B1 b = new B1();
		B1 b2 = new B1(10);
	}
}
