package editplus;

class Test05{
	public static void main(String[] args){
		//문제1. 정수형 변수 a와 b에 각각 10,20을 대입해서 만들고, 값을 서로 교환해서 출력해보세요.
		int a =10,b=20 ; //변수 a, b만들고 값 대입

		System.out.println(a+" "+b); // 출력

		//변수의 값을 서로 교환하는 공식을 작성
		int temp=a; // 임시 변수 temp에 a의 값을 대입
		a=b; // b의 저장되어 있는 값을 a에 대입
		b=temp; // temp에 저장되어 있던 a의 값을 b에 대입함

		System.out.println(a+" "+b); // 출력

		//문제2. 나의 명함 만들기 (이름, 전화번호, 이메일 등등)
		String name="이원일"; // 이름 저장
		String pnum="010-9338-8782";// 전화번호 저장
		String email="wonil0304@gmail.com"; // 이메일 저장
		System.out.println("---------------------");
		System.out.println("이름\t : " +name);
		System.out.println("전화번호 : " +pnum);
		System.out.println("이메일\t : "+email);
		System.out.println("---------------------");
	}
}
