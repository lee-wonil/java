package javaTest.java02;

class  OperatorEx10
{
	public static void main(String[] args) 
	{
		int a = 1000000;
		int b = 2000000;
		long c = (long)a*b; //int 형과 int 형의 연산결과는 int형이기 때문에 'a*b 의값이 이미 int형값이므로 long 형의변수에 저장되어도 결과는 같다.
		System.out.println(c);
	}
}
