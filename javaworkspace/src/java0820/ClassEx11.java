package java0820;

import java.util.Scanner;

/*
Tv ��� ����
Ŭ0. �ʿ��Ѻ��� : ä��, ����, �Ŀ�, 
Ŭ1. ä�� = �迭[10] ������, ������ 10�� �����Ͽ� �迭�� ������ ���� ���� // ������ ������� 
Ŭ2. ä��(up,down)= �迭�� ���� ��ġ���� ����
Ŭ3. ä�ΰ��� �Է¹޾� ����(ä�ο� �´� ���� �ƴ� ��� ���� ����)
Ŭ4. ������ 0~10 ���� ����
Ŭ5. ���� ���Ұ� ��� vol = 0;
Ŭ6. TV ������� : �޼ҵ� ȣ���ϸ� Tv ���� ��� (ä��, ����, ��������)
Ŭ7. ������ ���� �ִ� ���� ��� ��� ���� ���ϰ�
---> ���� ����� (����) -> �ʿ��� ����ϳ��� �޼���� �̸� ���� �����
*/

public class ClassEx11 {
	public static void main(String[] args) {
		MyTv t1 = new MyTv();
		Scanner sc = new Scanner(System.in);
		t1.setCh();
		t1.getCh();
		System.out.println();	
		System.out.println("ä�� �� ȣ��!");
		t1.chUp();
		System.out.println("ä�� �ٿ� ȣ��!");
		t1.chDown();
		System.out.println("ä�� ���� ȣ���� ���� ���ڸ� �Է��ϼ���");
		int ch = Integer.parseInt(sc.nextLine());
		t1.changeCh(ch);
		System.out.println("������ ȣ��!");
		t1.volUp();
		System.out.println("���Ұ� ȣ��!");
		t1.mute();
		System.out.println("�����ٿ� ȣ��!");
		t1.volDown();		
		System.out.println("TV���� ȣ��");
		t1.tvinfo();
		System.out.println("������ ���¸� �����մϴ�.");
		t1.power();
		System.out.println("ä�� �� ȣ��!");
		t1.chUp();
		System.out.println("ä�� �ٿ� ȣ��!");
		t1.chDown();
		System.out.println("ä�� ���� ȣ���� ���� ���ڸ� �Է��ϼ���");
		ch = Integer.parseInt(sc.nextLine());
		t1.changeCh(ch);
		System.out.println("������ ȣ��!");
		t1.volUp();
		System.out.println("���Ұ� ȣ��!");
		t1.mute();
		System.out.println("�����ٿ� ȣ��!");
		t1.volDown();
		System.out.println("TV���� ȣ��");
		t1.tvinfo();
		t1.power();
		t1.chUp();
		sc.close();
	}

}
