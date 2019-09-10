package java0828;

import java.util.Calendar;

class Single{
	static int b=1;
	int a = 100;
	
	private static Single instance= new Single();
	private Single() {
		
	}
	public static Single getInstance() {
		return instance;
	}
	void func() {
		System.out.println("╫л╠шео");
	}
}


public class SingleEx01 {
	public static void main(String[] args) {
		Single s = Single.getInstance();
		s.func();
		System.out.println(s.a);
		s.a=200;
		System.out.println(s.a);
		
		Single s2 = Single.getInstance();
		System.out.println(s2.a);
		System.out.println(Single.b);
		s.b =2;
		System.out.println(Single.b);
		System.out.println(s.b);
		System.out.println(s2.b);
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());


	}
}
