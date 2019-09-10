package javaTest.java02;

class  OperatorEx11
{
	public static void main(String[] args) 
	{
		long a = 1000000 * 1000000; 
		//디폴트 값이 int 이므로 int 와 int 의 연산이기 때문에 int결과값이 출력된다.
		long b = 1000000 * 1000000L;
		//int 와 long 의 연산이므로 결과가 long 형이다...디폴트값(int) 아닌경우 접미사를 붙여야한다..
		System.out.println(a);
		System.out.println(b);
	}
}
