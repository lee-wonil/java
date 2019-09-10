package javaTest.java03;

class  FlowEx4
{
	public static void main(String[] args) 
	{
		int score = 45;
		char grade = ' ';
		grade = (score >=90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}
}
/* 
	FlowEx3 의 예제를 삼항연산자로 변경한것이다. 
	이렇듯 삼항연산자로 활용하면 if문을 간단히 표현할수 있다. 
*/