package javaTest.java05;
class Data3 { int x; }

class ParameterTest2 {
	public static void main(String[] args) {

		Data3 d = new Data3();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(Data3 d) { // ������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
