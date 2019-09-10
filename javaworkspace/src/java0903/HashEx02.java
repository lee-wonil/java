package java0903;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx02 {

	public static void main(String[] args) {
		//���� 1. ���� ���� �����
		//HashMap�� �̿��Ͽ� 10���� �ܾ ����, �ѱ��� ������ �����ϰ�
		//����� �˻��ϴ� ���α׷��� ��������.
		//�� , exit�� �ԷµǸ� ���α׷� ����.
		Scanner sc = new Scanner(System.in);

		HashMap <String,String> map = new HashMap<>();
		map.put("reservation", "����");
		map.put("typically", "����");
		map.put("in public", "������� �ִ� ����");
		map.put("multitude", "���� ���� ��");
		map.put("relative", "�񱳻���");
		map.put("cumulative", "�����Ǵ�");
		map.put("speculative", "������ �ٰ���");
		map.put("legislative", "�Թ���");
		map.put("superlative", "�ֻ���");
		map.put("manipulative", "�����ϴ�");
		System.out.println("���� �����Դϴ�.");
		while(true) {
			System.out.print("ã�� �ܾ �Է��ϼ���. exit�� �Է½� ���α׷��� ����˴ϴ�.");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			if(map.containsKey(s)) {	// ã�� ���
				System.out.println(s+"�� ���� "+map.get(s)+"�Դϴ�.");
			}
			else {
				System.out.println("�ش� �ܾ ã�� ���߽��ϴ�.");				
			}

		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		sc.close();

	}
}