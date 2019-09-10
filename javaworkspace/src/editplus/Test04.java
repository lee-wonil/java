package editplus;

class  Test04{
	public static void main(String[] args) 	{
		//출력문 연산
		System.out.println(10+3);
		System.out.println("a"+"b"+"c");
		System.out.println("A"+10);
		System.out.println('A'+10);//A=65
		//'0' = 48, 'A' =65, 'a'=97

		//이스케이프 문자
		System.out.print("안녕\t하\"세요\n");
		System.out.print("여\\러분\n");

		//printf()
		int a = 10;
		int b = 100;
		System.out.printf("%d %d \n",a,b);
		char ch = 'A';
		System.out.printf("%c \n",ch);
		// System.out.printf("%d \n",ch);  불가

		String str = "hello";
		System.out.printf("%s \n",str);
		double d =3.1415;
		System.out.printf("%f \n",d); // "%.2f"의 경우 소수점 2번째 자리까지 출력


	}
}
