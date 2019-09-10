package javaTest.java03;

class  FlowEx18
{
	public static void main(String[] args) 
	{
		System.out.println("자, 이제 카운트다운을 시작합니다.");
		for(int i=10;i>=0;i--){
			for(int j=1;j<=1000000000;j++){
				;
			}
			System.out.println(i);
		}
		System.out.println("GAME OVER");
	}
}
/* 
	for문의 동작시간을 이용하여 응용해본것이다. 
	하지만 컴퓨터의 성능에따라. 조금씩 시간차이가날수있쓰니 알아두기만 하자..
*/