package javaTest.java07;
class StringEx6 
{
	public static void main(String[] args) 
	{
		int value = 100;
		String strvalue = String.valueOf(value);	//int 를 String  로 형변환

		int value2 = 100;
		String strvalue2 = value2 + "";		//형변환의 또다른 방법...

		System.out.println(value);
		System.out.println(value2);
	}
}
