package editplus;

//�Է¹�
//#1.import�� ��� : �۾������� �� ��ܿ� �ۼ��Ѵ�.
import java.util.Scanner;

class Test07{
	
	public static void main(String[] args){
		
		// #2. Scanner ��ü ���� : ����ϱ� ���� �ѹ��� ���ָ� �ȴ�. �� ���� �ݾ��ش�.
		Scanner sc = new Scanner(System.in);
		// #3. �Է¹ޱ�
		System.out.println("�λ縻�� �Է��ϼ���.: "); // �Է��� ���� ����ڿ��� �����ϴ� ���� ���
		String str = sc.nextLine();
		
		System.out.println("���� �Է� : ");
		String age = sc.nextLine();

		//����ؼ� Ȯ��
		System.out.println(str);
		System.out.println(age);
		// #4. ��ü �ݱ�
		sc.close();

	}
}
