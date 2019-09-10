package javaTest.java03;

class  FlowEx2
{
	public static void main(String[] args) 
	{
		int i = 0;
		if(i < 1)  {
			System.out.println("처음 오셧군요 방문해주셔서 감사합니다.");
		}else{
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		System.out.println("방문 횟수는 "+ ++i +"번 입니다.");
	}
}
