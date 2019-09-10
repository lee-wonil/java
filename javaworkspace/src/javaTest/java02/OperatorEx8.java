package javaTest.java02;

class  OperatorEx8
{
	public static void main(String[] args) 
	{
		byte a = 10,b = 20;
//		byte c = a+b; //int형보다 크기가 작은 자료형은 int형으로 변환후에 연산을 수행한다.
		byte c = (byte)(a+b); // 우선순위에 의해 () 묵어줘야한다.
		System.out.println(c);
	}
}
