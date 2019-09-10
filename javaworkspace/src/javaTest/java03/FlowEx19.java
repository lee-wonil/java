package javaTest.java03;

class  FlowEx19
{
	public static void main(String[] args) 
	{
		int i = 10;
		while(i >= 0){
			
			System.out.println(i);
			i--;
		}
	}
}
// 출력문의 'i--' 는 후위형이기때문에 i가 출력된후 감소한다.