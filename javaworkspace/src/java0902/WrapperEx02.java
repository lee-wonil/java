package java0902;

public class WrapperEx02 {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		int ii = i.intValue();
		System.out.println(ii);
		
		Character c = new Character('c');
		char ch = c.charValue();
		//char ch = c; //둘다 가능
		System.out.println(ch);
		
		int a = Integer.parseInt("123");
		System.out.println(a);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
	}
}
