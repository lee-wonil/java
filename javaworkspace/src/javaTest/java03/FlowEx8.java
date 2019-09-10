package javaTest.java03;
class  FlowEx8{
	public static void main(String[] args) {
		int score = 3;
		String msg = "";
		score *= 100;
		msg = "당신의 점수는"+score+"이며 상품은-";
		switch(score){
			case 100 :
				msg += "볼펜,";
			case 200 :
				msg += "TV,";
			case 300 :
				msg += "자전거,";
			case 400 :
				msg += "노트북,";
			break;
			default :
				msg += "꽝";
		}
		System.out.println(msg+"입니다");
	}
}
