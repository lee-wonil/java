package java0903;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02 {
	public static void main(String[] args) {
		//�����̸� 4���� �Է¹޾� ArrayList�� �����ϰ�
		//��� ����� �� ���� �� �̸��� ����ϼ���.
		Scanner sc= new Scanner(System.in);
		ArrayList<String>name = new ArrayList<>();
		final int SIZE = 4;		// �迭�� ���̸� ���� ��Ű�� ���� ���� ���� // ���ص� ��� ����
		for(int i=0;i<SIZE;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String input = sc.nextLine();
			name.add(input);// ArrayList�� �Է¹��� �����͸� ����
		}
		System.out.println(name);// ArrayList ���
		String max = name.get(0);// ���� �� �̸��� ����ϱ� ���� ���� // �ӽ÷� ArrayList�� ù��° ���� �־���
		for(int i=0;i<SIZE;i++) {
			if(max.length()<name.get(i).length()) {	// max�� ����Ǿ� �ִ� ���̿� ArrayList�� i��° �ε����� ���̸� ���ؼ� max�� ���� ���� ���
				max=name.get(i);					// max�� ���� �ε����� ���� �����Ѵ�.
			}
		}
		System.out.println(max);
		sc.close();
	}
}
