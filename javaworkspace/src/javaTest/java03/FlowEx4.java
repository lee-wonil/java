package javaTest.java03;

class  FlowEx4
{
	public static void main(String[] args) 
	{
		int score = 45;
		char grade = ' ';
		grade = (score >=90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		
		System.out.println("����� ������ "+grade+" �Դϴ�.");
	}
}
/* 
	FlowEx3 �� ������ ���׿����ڷ� �����Ѱ��̴�. 
	�̷��� ���׿����ڷ� Ȱ���ϸ� if���� ������ ǥ���Ҽ� �ִ�. 
*/