package java0820;
//���ȣ�� : factorial : 1���� �Է¹��� �� n���� ���� ����� �����ִ� �޼���
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
		System.out.println("�����Է�");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		long result = factorial(num);
		System.out.println(result);
		sc.close();
	}
}
