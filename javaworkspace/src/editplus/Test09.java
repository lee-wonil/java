package editplus;

import java.util.Scanner;

class Test09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		System.out.println(age+10);
		System.out.println("혈액형 : ");
		String blood = sc.next();
		System.out.println(blood);
		
		System.out.println("키 입력");
		double height = sc.nextDouble();
		System.out.println(height+10);
		
		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		System.out.println(str);
		*/
		// nextLine()으로 리턴 받은 값을 형변환
		//int
		//System.out.println("숫자 입력: ");
		//String str = sc.nextLine(); // 문자열(String)형으로 리턴
		//int num = Integer.parseInt(str);// int 형으로 변환 : Integer.parseInt(변환할 변수)
		//System.out.println(num+50);
/*
		System.out.println("실수 입력: ");
		String str = sc.nextLine(); // 문자열(String)형으로 리턴
		double d = Double.parseDouble(str);// double 형으로 변환 : Double.parseDouble(변환할 변수)
		System.out.println(d+1.1);
*/
		//축약형
		System.out.println("실수 입력: ");
		double d = Double.parseDouble(sc.nextLine());
		System.out.println(d+1.1);




	}
}
