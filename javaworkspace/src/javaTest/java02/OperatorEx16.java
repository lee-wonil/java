package javaTest.java02;

class  OperatorEx16
{
	public static void main(String[] args) 
	{
		float pi = 3.141592f;//기준이 더큰거라서 f를붙여준다
		float shortPi = (int)(pi * 1000) / 1000f;
		/*
			(pi*1000)수행 3141.592 가되지만  단항연산은 int 값이므로 소수점이하값은 버리게된다. 3141을 얻는다
			3141 / 1000f 수행 int 와 float 의 연산이므로 큰갑인 float 로 변환되어 연산이 수행된다. 3.141 이 된다..
		*/
		System.out.println(shortPi);
	}
}
