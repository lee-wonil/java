package javaTest.java03;
class  FlowEx11{
	public static void main(String[] args) {
		int score = 88;
		String grade = "";
		switch(score/5){
			case 20 :
			case 19 :
				grade ="A+";
			break;
			case 18 :
				grade ="A";
			break;
			case 17 :
				grade = "B+";
			break;
			case 16 :
				grade ="B";
			break;
			case 15 :
				grade ="C+";
			break;
			case 14 :
				grade="C";
			break;
			case 13 :
				grade = "D+";
			break;
			case 12 :
				grade ="D";
			break;
			default :
				grade ="F";
		}
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}
}
