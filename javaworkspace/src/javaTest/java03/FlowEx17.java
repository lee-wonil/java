package javaTest.java03;

class  FlowEx17
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0;i<1000000000;i++){
			;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("시작시간 : "+startTime);
		System.out.println("종료시간 : "+endTime);
		System.out.println("소요시간 : "+(endTime - startTime));
	}
}
/*
	currentTimeMillie() 는 1970년 1월 1일부터 현재까지의 시간을 천분의 일초로 계산한 결과를 long형의 정수로 반환하는 메서드 이다.
	for문내의 블럭{}에 아무런 작업도 하지않는 빈문장(;)을 만들었기 때문에 조건식의 (i < 100000000)과 증감식(i++)만 10억 번을 
	반복처리 하는데 걸린시간 이다. (약 1.5초)
*/