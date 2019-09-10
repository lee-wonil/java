package javaTest.java07;
class StringEx5 
{
	static char[] c = new char[0];
	static String s = new String(c);

	public static void main(String[] args) 
	{
		System.out.println(s);
		System.out.println(c.length);
	}
}
