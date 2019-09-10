package javaTest.java03;
class  FlowEx6{
	public static void main(String[] args) {
		int score = 3; 
		switch(score*100){
			case 100 : 
				System.out.println("당신의 점수는 100 이고, 상품은 자전거입니다.");
			break;
			case 200 :
				System.out.println("당신의 점수는 200 이고, 상품은 TV 입니다.");
			break;
			case 300 :
				System.out.println("당신의 점수는 300 이고, 상품은 노트북 입니다.");
			break;
			case 400 :
				System.out.println("당신의 점수는 400 이고, 상품은 자동차 입니다.");
			break;
			default :
				System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		}
	}
}




