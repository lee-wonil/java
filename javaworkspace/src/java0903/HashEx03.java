package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx03 {
	static HashMap<String, Integer> map = new HashMap<>();		// Ŭ���� ���� Hashmap Ÿ���� map ����
	static Scanner sc = new Scanner(System.in);					// Ŭ���� ���� Scanner Ÿ���� sc	����
	public static void main(String[] args) {
		//HashMap�� �̿��Ͽ� �л� �̸��� �ڹ� ������ ����ϴ� ���� ���α׷� �ۼ�
		// �Ʒ� ���α׷� �޴����� �� ��ȣ�� ���� ����,
		// 6���� �Է¹����� ���α׷� ����
		/*
		 **�ڹ� ���� ���� ���α׷�**
		 	1.��ü��ȸ
		 	2.���
		 	3.����
		 	4.����
		 	5.��ü���
		 	6.���α׷�����
		 */			
		System.out.println("**�ڹ� ���� ���� ���α׷�**");
		while(true) {
			System.out.println("1.��ü��ȸ");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.println("4.����");
			System.out.println("5.��ü���");
			System.out.println("6.���α׷�����");
			System.out.print("���Ͻô� �޴� ��ȣ�� �Է��ϼ���.");
			int a = Integer.parseInt(sc.nextLine());
			if(a==1) {
				findAll();		//static �޼��� ȣ��
			}
			else if(a==2) {
				add();			//static �޼��� ȣ��
			}
			else if(a==3) {
				change();		//static �޼��� ȣ��
			}
			else if(a==4) {
				delete();		//static �޼��� ȣ��
			}
			else if(a==5) {
				average();		//static �޼��� ȣ��
			}
			else if(a==6) {
				break;			//6�Է½� ����
			}
			else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
	public static void findAll() {
		Set<String> set = map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			System.out.println(key+"�л��� ������ "+val+"�Դϴ�.");			
		}
	}
	public static void add() {
		System.out.print("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		if(map.containsKey(name)) {	// �ߺ��Ǵ� �̸��� �ִ� ���
			System.out.println("�̹� �ִ� �̸� �Դϴ�.");
			return;
		}
		System.out.print("������ �Է��ϼ���");
		int score = Integer.parseInt(sc.nextLine());
		map.put(name, score);
	}
	public static void change() {
		System.out.print("������ �ٲ� �л��� �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		if(map.containsKey(name)) {	// �ߺ��Ǵ� �̸��� �ִ� ���
			System.out.print("������ �Է��ϼ���");
			int score = Integer.parseInt(sc.nextLine());
			map.put(name, score);
		}
		else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}		
	}
	public static void delete() {
		System.out.print("������ �л��� �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println("�����Ϸ�");
		}
		else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}	
	}
	public static void average() {
		double d=0;
		Set<String> set = map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			d +=val;	
		}
		d/=set.size();
		System.out.println("��ü ����� "+d+"�Դϴ�.");
	}
}
