package java0829;

import java.util.Scanner;

public class Exception04 {
	public static void main(String[] args) {
		//3���� ������ �Է¹޾� ���� ���ϴ� ���α׷�
		Scanner sc =new Scanner(System.in);
		System.out.println("���� 3�� �Է�:");
		int sum =0;
		int n=0;
		for(int i =0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=sc.nextInt();//java.util.InputMismatchException
				
			}
			catch(Exception e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���");
				i--;		// �ε��� �������� �ʵ��� �̸� ����
				sc.next();	// ���� �Է� ��Ʈ���� �����ִ� ��ū�� �����				
				continue;	//�Ʒ����� sum+=n�� �������� �ʰ� �ٷ� ���������� �Ѿ�� �ϱ� ���ؼ�
			}
			sum+=n;
		}
		System.out.println("sum >>"+sum);
		sc.close();

	}
}
