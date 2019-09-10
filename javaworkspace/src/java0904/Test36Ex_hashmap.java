package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	�̸��� ����(4.5����)�� 5�� �Է¹޾� �ؽ��ɿ� �����ϰ�, ���л� ���� ������ �Է¹޾� ���л� ����� ����ϼ���.
	���ؿ���:
		�ڹ����бݰ����ý����Դϴ�.
		�̸��� ���� >> ȣũ���� 3.1
		�̸��� ���� >> �������� 3.6
		�̸��� ���� >> �丣 2.9
		�̸��� ���� >> ����Ǯ 3.7
		�̸��� ���� >> ���̾�� 4.3
		���л� ���� ���� ���� �Է� >> 3.2
		���л� ��� : �������� ����Ǯ ���̾��
*/
class Scholarship{
	HashMap <String,Double> map;
	Scanner sc;
	Scholarship(String s){
		System.out.println(s+"�����ý����Դϴ�.");
		map = new HashMap<>();
		sc = new Scanner(System.in);
	}
	void read() {
		for(int i=0;i<5;i++) {
			System.out.print("�̸��� ���� >>");
			String input = sc.nextLine();
			String [] data = input.split(" ");
			String name = data[0];
			double score = Double.parseDouble(data[1]);
			map.put(name, score);
		}
	}
	void select() {
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double scoreLine = Double.parseDouble(sc.nextLine());
		Set keySet = map.keySet();
		Iterator it =keySet.iterator();
		System.out.print("���л� ��� : ");
		while(it.hasNext()) {
			String name = (String)it.next();
			double yourscore = map.get(name);
			if(scoreLine<yourscore) {
				System.out.print(name+" ");
			}
		}
	}
}
public class Test36Ex_hashmap {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("�ڹ����б�");
		sship.read();
		sship.select();

	}
}
