package javaTest.java03;

class FlowEx24 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++){
			if(i%3==0)
				continue; //3으로 나눠서 떨어지면 반복문끝으로 가서 다시 반복이 시작된다.
			System.out.println(i);
		}
	}
}
