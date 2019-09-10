package java0823;

import java.util.Scanner;

/*
�Ϸ������� ǥ���ϴ� Ŭ���� Day�� ������ ����. 
�Ѵ��� ������ ǥ���ϴ� MonthSchedule Ŭ������ �ۼ��ϼ���.
MonthSchedule Ŭ�������� Day ��ü �迭�� ������ ����,�޼��带 �ۼ��ϰ�
���� ����ó�� �Է�, ����, ������ ���� 3���� ����� �ۼ��϶�. 
 -> ������, input(), view(), finish(), run() �޼ҵ� �����. 
#���࿹��#
�̹��� ������ ���� ���α׷�. 
����(�Է�:1, ����:2, ������:3) >> 1
��¥(1~30)? 1
����? �ڹٰ���

����(�Է�:1, ����:2, ������:3) >> 2
��¥(1~30)? 1
1���� �� ���� �ڹٰ����Դϴ�.

����(�Է�:1, ����:2, ������:3) >> 3
���α׷� ����.
*/
class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	private int day;
	private Day[] days;
	private Scanner sc ;
	MonthSchedule(int day){
		this.day=day;
		days = new Day[day];
		for(int i=0;i<day;i++) {
			days[i]=new Day();
		}
		sc = new Scanner(System.in);
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�." );
		int knum=0;
		while(knum!=3) {//3�Է½� ����
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			knum=Integer.parseInt(sc.nextLine());
			if(knum==1) {
				input();
			}
			else if(knum==2) {
				view();
			}
			else if(knum==3) {
				finish();
			}
			else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
	}
	public void input() {
		System.out.print("��¥(1~"+day+")?");
		int daycount=Integer.parseInt(sc.nextLine());		
		daycount--;// ����ڷ� ���� 1���� 30���� ������ �ϳ��� �Է� ������ �迭���� 0~day-1���� ��ȸ�� �ȴ�.
		if(daycount<0||daycount>day) {
			System.out.println("��¥�� �߸� �ԷµǾ����ϴ�.");
			return;
		}
		System.out.print("����?");
		String work=sc.nextLine();
		days[daycount]=new Day();
		days[daycount].set(work);
	}
	public void view() {
		System.out.print("��¥(1~"+day+")?");
		int daycount=Integer.parseInt(sc.nextLine());
		daycount--;
		if(daycount<0||daycount>day) {
			System.out.println("��¥�� �߸� �ԷµǾ����ϴ�.");
			return;
		}
		System.out.print(daycount+"���� �� ���� ");
		days[daycount].show();
	}
	public void finish() {
		sc.close();//close()�ѹ��ϸ� �ٽ� ��ü �����ص� ���Ұ�
		System.out.println("���α׷� ����");
	}
}

public class ClassEx36 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ �� ��
		april.run();
	}

}
