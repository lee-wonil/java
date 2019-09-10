package java0829;

import java.util.Scanner;

public class Exception04 {
	public static void main(String[] args) {
		//3개의 정수를 입력받아 함을 구하는 프로그램
		Scanner sc =new Scanner(System.in);
		System.out.println("정수 3개 입력:");
		int sum =0;
		int n=0;
		for(int i =0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=sc.nextInt();//java.util.InputMismatchException
				
			}
			catch(Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				i--;		// 인덱스 증가하지 않도록 미리 감소
				sc.next();	// 현재 입력 스트림에 남아있는 토큰을 지운다				
				continue;	//아래남은 sum+=n을 실행하지 않고 바로 증감식으로 넘어가게 하기 위해서
			}
			sum+=n;
		}
		System.out.println("sum >>"+sum);
		sc.close();

	}
}
