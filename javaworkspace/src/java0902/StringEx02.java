package java0902;

public class StringEx02 {
	public static void main(String[] args) {
		// ���ڿ� ����
		System.out.println("abc"+1+true+2.13e-1+'E'+"def");
		// ��ü + ���ڿ� ����
		System.out.println(new StringEx02()+"�Դϴ�.");
		// ���ڿ� ����
		System.out.println("I`m ".concat("sleepy"));
		
		//trim()
		String a ="      abcd   efg     ";		
		String b= a.trim();
		System.out.println(a);
		System.out.println(b);
		
		//charAt()
		String str = "class";
		char ch=str.charAt(0);
		System.out.println(ch);
		
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='s')count++;
		}
		System.out.println(count);
	
	
	}
}
