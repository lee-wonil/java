package java0826;


class A{
	public A(){
		System.out.println("持失切 A");
	}
}
class B extends A{
	public B() {
		System.out.println("持失切 B");
	}
}
class C extends B{
	public C() {
		System.out.println("持失切 C");
	}
}



public class InheriEx04 {
	public static void main(String[] args) {
		C c;
		c= new C();
		
	}
}
