package javaTest.java03;
class  FlowEx10
{
	public static void main(String[] args) 
	{
		int score = 88;
		char grade = ' ';

		switch(score / 10){      // int / int = int �̴�. 88 / 10 = 8.8 �� �ƴ϶� 8�� ���� ��Եȴ�.
			case 10 :
			case 9 :
				grade ='A';
			break;
			case 8 :
				grade ='B';
			break;
			case 7 :
				grade = 'C';
			break;
			case 6 :
				grade = 'D';
			break;
			default :
				grade='F';
		}
		System.out.println("����� ������ "+grade+" �Դϴ�.");
	}
}
