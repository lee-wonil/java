package java0902;

public class ApiTest06 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println("----------------------");
		String c = new String("hello");
		String d = new String("hello");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		String e = "hello";
		System.out.println(System.identityHashCode(e));
		// String instance address check : System.identityHashCode();
		String s = new String ("test");
		System.out.println("S: "+System.identityHashCode(s));
		String t = s;
		System.out.println("T: "+System.identityHashCode(t));
		t= s.concat("java");
		System.out.println(s);
		System.out.println(t);
		System.out.println("S: "+System.identityHashCode(s));
	
		System.out.println("T: "+System.identityHashCode(t));

	}
}
