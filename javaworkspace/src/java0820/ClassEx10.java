package java0820;
//재귀호출 : factorial : 1부터 입력받은 수 n까지 곱합 결과를 돌려주는 메서드
import java.util.*;
public class ClassEx10 {
	static long factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {	
			return n* factorial(n-1);
		}

	}
	public static void main(String[] args) {
		System.out.println("정수입력");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		long result = factorial(num);
		System.out.println(result);
		sc.close();
	}
}
