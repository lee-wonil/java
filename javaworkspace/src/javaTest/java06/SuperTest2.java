package javaTest.java06;
class SuperTest2 {
	public static void main(String args[]) {
		Child4 c = new Child4();
		c.method();
	}
}

class Parent4 {
	int x=10;
}

class Child4 extends Parent4 {
	int x=20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}