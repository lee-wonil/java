package javaTest.java03;
class FlowEx3  {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);	// Scanner�� ��ä�ϱ�
		char grade = ' '; 

		if(score >= 90) 
			grade = 'A';
		else if(score >=80)
			grade = 'B';
		else				
			grade = 'C';
		
		System.out.println("����� ������ "+grade+" �Դϴ�.");
	}
}
