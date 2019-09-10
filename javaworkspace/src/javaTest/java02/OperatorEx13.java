package javaTest.java02;

class  OperatorEx13
{
	public static void main(String[] args) 
	{
		char c1 = 'a';  //c1 에는 문자 'a'의 코드값인 97이 저장된다
		char c2 = c1;	
		char c3 = ' ';
		
		int i = c1 + 1; //코드값이 변환되어 int 값이되는것이다. 97+1 과같다.
		
		c3 = (char)(c1+1); //덧셈연산이 int 값이므로 char형으로 형변환이 필요하다.
		c2++; //c2에 저장되 c1 값이 2번증가하여 'c'출력된다. 
		c2++;
		i =' ';
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}
}
