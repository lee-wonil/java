package javaTest.java02;

class  OperatorEx15
{
	public static void main(String[] args) 
	{
		char a = 'a';
		char b = (char)(a -32);
		//아스키코드의 'a'는 97이다. 97-32=65 아스키코드의 65 는 'A' 이다. 
		System.out.println(b);
	}
}

