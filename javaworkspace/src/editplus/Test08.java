package editplus;

import java.util.*;//#1.scanner 클래스 import 하기

class Test08{
	public static void main(String[] args){
		//이름, 나이 혈액형, 키를 입력받고 출력하는 프로그램을 만들어 보세요.
		//단 , 모두 문자열로 입력받기 nextLine()사용
		//#2. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : "); // 안내문
		String name = sc.nextLine(); // 이름 입력

		System.out.print("나이를 입력하세요 : "); // 안내문
		String age = sc.nextLine();// 나이 입력

		System.out.print("혈액형을 입력하세요 : "); // 안내문
		String blood = sc.nextLine();// 혈액형 입력

		System.out.print("키를 입력하세요 : "); // 안내문 
		String height = sc.nextLine(); // 키 입력

		System.out.println("이름 : "+name); // 이름 출력
		System.out.println("나이 : "+age); // 나이 출력
		System.out.println("혈액형 : "+blood); // 혈액형 출력
		System.out.println("키 : "+height); // 키 출력

		//#4, 입력종료 시 스캐너 클래스 닫기
		sc.close();
	}
}
