package java0903;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx02_1 {

	public static void main(String[] args) {
		//���� 1. ���� ���� �����
		//HashMap�� �̿��Ͽ� 10���� �ܾ ����, �ѱ��� ������ �����ϰ�
		//����� �˻��ϴ� ���α׷��� ��������.
		//�� , exit�� �ԷµǸ� ���α׷� ����.
		Scanner sc = new Scanner(System.in);

		HashMap <String,String> map = new HashMap<>();
		map.put("apple", "���");
		map.put("pear", "��");
		map.put("book", "å");
		map.put("paper", "����");
		map.put("pants", "����");
		map.put("table", "å��");
		map.put("water", "��");
		map.put("clock", "�ð�");
		map.put("extend", "Ȯ���ϴ�");
		map.put("class", "����");		

		System.out.println("���� �����Դϴ�.");
		while(true) {
			System.out.print("ã�� �ܾ �Է��ϼ���. exit�� �Է½� ���α׷��� ����˴ϴ�.");
			String eng = sc.nextLine();
			if(eng.equals("exit")) {
				break;
			}
			String kor = map.get(eng);
			if(kor==null)System.out.println(eng+"�� ���� �ܾ� �Դϴ�.");
			else System.out.println(kor);
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		sc.close();

	}
}