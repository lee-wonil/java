package javaTest.java03;
class  FlowEx9{
	public static void main(String[] args) {
		int score = 88;
		char grade = ' ';
		switch(score){
			case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : 
			case 94 : case 93 : case 92 : case 91 :
			case 90 :
				grade = 'A';
			break;
			case 89: case 88: case 87: case 86 : case 85 :
			case 84 : case 83 : case 82 : case 81: 
			case  80 :
				grade = 'B';
			break;
			default :
				grade = 'F';
		}
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}
}
/*
	FlowEx3 의 if 예제를 switch 문을 이용해서 변경한것이다. 
	이 예제를 if 문을 이용해서 그현하려면 조건식이 4개가 필요하다.
	반면 switch 문을 이용하면 조건식 1번이면 되므로 더 빠르나 
	그러나 case문이 너무 많아지므로 좋지 않은 코드가 된다. 

	반드시 속도를 향상시켜야한다면 if 문보다 switch 문이 좋지만 
	그렇지 않더라면 이런경우 if 문이 더 적합하다..
*/