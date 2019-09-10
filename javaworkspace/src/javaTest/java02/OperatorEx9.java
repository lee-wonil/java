package javaTest.java02;

class  OperatorEx9
{
	public static void main(String[] args) 
	{
		byte a = 10, b = 30;
		byte c = (byte)(a*b);  //byte형은 -128~127 까지 표현 overflow현상에 의해 44가 찍힌다. 
		System.out.println(c);
	}
}
