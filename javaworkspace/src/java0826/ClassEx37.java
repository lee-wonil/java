package java0826;

import java.util.Scanner;

class Seat{
	private String name="___";
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Booking{
	Scanner sc;
	private Seat []seatS = new Seat[10];
	private Seat []seatA = new Seat[10];
	private Seat []seatB = new Seat[10];
	Booking() {
		sc=new Scanner(System.in);
		for(int i=0;i<seatS.length;i++) {
			seatS[i]=new Seat();
		}
		for(int i=0;i<seatA.length;i++) {
			seatA[i]=new Seat();
		}
		for(int i=0;i<seatB.length;i++) {
			seatB[i]=new Seat();
		}
	}
	public void book() {
		System.out.println("�¼����� S(1), A(2), B(3)");
		int sel = Integer.parseInt(sc.nextLine());
		showSingle(sel);
		System.out.print("�̸�>>");
		String name = sc.nextLine();
		System.out.print("�¼���ȣ >>");
		int seatNum=Integer.parseInt(sc.nextLine());
		if(sel==1) seatS[seatNum-1].setName(name);
		else if(sel==1) seatA[seatNum-1].setName(name);
		else if(sel==1) seatB[seatNum-1].setName(name);
	}
	public void showSingle(int seat) {
		switch(seat) {
		case 1:
			System.out.print("S >>");
			for(int i =0;i<seatS.length;i++) {
				System.out.print(seatS[i].getName()+" ");				
			}
			System.out.println();
			break;
		case 2:
			System.out.print("A >>");
			for(int i =0;i<seatA.length;i++) {
				System.out.print(seatA[i].getName()+" ");				
			}
			System.out.println();
			break;
		case 3:
			System.out.print("B >>");
			for(int i =0;i<seatB.length;i++) {
				System.out.print(seatB[i].getName()+" ");				
			}
			System.out.println();
			break;
		default :
			System.out.println("�¼��� �߸� �Է��߽��ϴ�.");
			break;
		}
		
	}
	public void showAll() {
		System.out.print("S >>");
		for(int i =0;i<seatS.length;i++) {
			System.out.print(seatS[i].getName()+" ");				
		}
		System.out.println();
		System.out.print("A >>");
		for(int i =0;i<seatA.length;i++) {
			System.out.print(seatA[i].getName()+" ");				
		}
		System.out.println();
		System.out.print("B >>");
		for(int i =0;i<seatB.length;i++) {
			System.out.print(seatB[i].getName()+" ");				
		}
		System.out.println();
	}
	public void cancle() {
		System.out.println("�¼����� S(1), A(2), B(3)");
		int sel = Integer.parseInt(sc.nextLine());
		showSingle(sel);
		System.out.print("�̸� >>");
		String name = sc.nextLine();
		if(sel==1) {
			for(int i=0;i<seatS.length;i++) {
				if(seatS[i].getName().equals(name)) seatS[i].setName("___");
			}
		}
		else if(sel==2) {
			for(int i=0;i<seatA.length;i++) {
				if(seatA[i].getName().equals(name)) seatA[i].setName("___");
			}
		}
		else if(sel==3) {
			for(int i=0;i<seatB.length;i++) {
				if(seatB[i].getName().equals(name)) seatB[i].setName("___");
			}			
		}
	}
	public void run() {
		System.out.println("�ڹ��ܼ�ƮȦ ����ý����Դϴ�.");
		while(true) {
			System.out.println("����:1, ��ȸ:2, ���:3, ������:4 >>");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==1) {book();}
			else if(sel==2) {showAll();}
			else if(sel ==3) {cancle();}
			else if(sel ==4) {
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("�޴���ȣ ���ÿ���! �ٽ��Է��ϼ���/");
			}
				
		}
	}
}



public class ClassEx37 {
	public static void main(String[] args) {
		Booking b = new Booking();
		b.run();
	}
	
}
