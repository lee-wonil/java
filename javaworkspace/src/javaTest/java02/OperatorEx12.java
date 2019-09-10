package javaTest.java02;

class  OperatorEx12
{
	public static void main(String[] args) 
	{
		int a = 1000000 * 1000000 / 1000000;
		int b = 1000000 / 1000000 * 1000000;
		// 먼저 곱을 하고 나누는것과 나누고 곱을 하는것이 결과 값이 다르다는것을 확인해보자.
	
		System.out.println(a);
		System.out.println(b);
	}
}
