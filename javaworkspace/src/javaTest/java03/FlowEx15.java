package javaTest.java03;

class  FlowEx15  
{
	public static void main(String[] args) 
	{
		for(int i=2 ; i<=9 ; i++){ 
			System.out.println(i+"단");

			for(int j=1 ; j<=9 ; j++){
				System.out.println(i+" * "+j+" = "+ i*j); 
			}
			System.out.println();
		}
	}
}
// 실행할 문장이 한술씩이므로 for 문 의 블럭{} 을 제외해도 무방하다.