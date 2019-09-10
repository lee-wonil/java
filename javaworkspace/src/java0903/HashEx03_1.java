package java0903;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class JavaScorePrg{
	// �ν��Ͻ� ����
	private Scanner sc;
	private HashMap<String,Integer> data;
	public JavaScorePrg() {
		// ������ 
		sc = new Scanner(System.in);
		data=new HashMap<>();
	}

	public void run() {
		System.out.println("**�ڹ� ���� ���� ���α׷�**");
		while(true) {
			System.out.println("1.��ü��ȸ\n2.���\n3.����\n4.����\n5.��ü���\n6.���α׷�����");
			System.out.print("���ϴ� ��ȣ�� �����ּ���");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==1) {
				showAll();
			}else if(sel==2) {
				putData();
			}else if(sel==3) {
				modifyData();
			}else if(sel==4) {
				deleteDate();
			}else if(sel==5) {
				getAvg();
			}else if(sel==6) {
				finish();break;
			}
			else {
				System.out.println("�߸��� �޴� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���");
			}

		}
	}
	private void showAll() {
		Set<String> set = data.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = data.get(name);
			System.out.println(name+" : "+score);
		}		
	}
	private void putData() {
		System.out.print("�̸� >> ");
		String name = sc.nextLine();
		System.out.print("���� >> ");
		int score = Integer.parseInt(sc.nextLine());
		Set<String> names = data.keySet();		// �����̸� Ȯ���ϰ� �̸���(key)������ Ȯ��
		if(names.contains(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�. �̸��� �ٽ� �Է����ּ���.");
			putData();
		}
		else {
			data.put(name, score);
			System.out.println("���� �Ϸ�");
		}
	}
	private void modifyData() {
		System.out.print("������ �л� �̸� >> ");
		String name = sc.nextLine();
		Set <String> names = data.keySet();
		if(names.contains(name)) {
			System.out.print("�� ���� >>");
			int score = Integer.parseInt(sc.nextLine());
			data.put(name, score);
			System.out.println("���� �Ϸ�!");
		}
		else {
			System.out.println("�������� �ʴ� �л��Դϴ�.");
		}
		
	}
	private void deleteDate() {
		System.out.print("������ �л� �̸� >> ");
		String name = sc.nextLine();
		Set <String> names = data.keySet();
		if(names.contains(name)) {
			data.remove(name);
			System.out.println("���� �Ϸ�!");
		}
		else {
			System.out.println("�������� �ʴ� �л��Դϴ�.");
		}

	}
	private void getAvg() {
		Collection<Integer> scores = data.values();
		Iterator<Integer> it = scores.iterator();
		int sum=0;
		while(it.hasNext()) {
			int n = it.next();
			sum+=n;
		}
		double aver = (double)sum/data.size();
		System.out.println("��ü ��� : "+aver);

	}
	private void finish() {
		System.out.println("�ý��� ����!");
		sc.close();
	}
}
public class HashEx03_1 {

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
		JavaScorePrg jsp = new JavaScorePrg();
		jsp.run();
	}
}
