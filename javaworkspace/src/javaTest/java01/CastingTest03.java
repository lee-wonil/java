package javaTest.java01;
class CastingTest03
{
	public static void main(String[] args)
	{
		char ch1='A';
		char ch2='Z';
			
		int num1=ch1;// 업캐스팅
		int num2=(int)ch2; // 업캐스팅

		System.out.println("문자 A의 유니코드 값: "+num1);
		System.out.println("문자 Z의 유니코드 값: "+num2);		
	}
}