package javaTest.java03;
class FlowEx3  {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);	// Scanner로 대채하기
		char grade = ' '; 

		if(score >= 90) 
			grade = 'A';
		else if(score >=80)
			grade = 'B';
		else				
			grade = 'C';
		
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}
}
