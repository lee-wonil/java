package editplus;

import java.util.*;//#1.scanner Ŭ���� import �ϱ�

class Test08{
	public static void main(String[] args){
		//�̸�, ���� ������, Ű�� �Է¹ް� ����ϴ� ���α׷��� ����� ������.
		//�� , ��� ���ڿ��� �Է¹ޱ� nextLine()���
		//#2. Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : "); // �ȳ���
		String name = sc.nextLine(); // �̸� �Է�

		System.out.print("���̸� �Է��ϼ��� : "); // �ȳ���
		String age = sc.nextLine();// ���� �Է�

		System.out.print("�������� �Է��ϼ��� : "); // �ȳ���
		String blood = sc.nextLine();// ������ �Է�

		System.out.print("Ű�� �Է��ϼ��� : "); // �ȳ��� 
		String height = sc.nextLine(); // Ű �Է�

		System.out.println("�̸� : "+name); // �̸� ���
		System.out.println("���� : "+age); // ���� ���
		System.out.println("������ : "+blood); // ������ ���
		System.out.println("Ű : "+height); // Ű ���

		//#4, �Է����� �� ��ĳ�� Ŭ���� �ݱ�
		sc.close();
	}
}
