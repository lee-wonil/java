package java0823;

import java.util.Scanner;

public class Reservation {
	private int sitNum;
	private String name;
	private final int MAXSIT=10;
	private Seat s[]=new Seat[MAXSIT];
	private Seat a[]=new Seat[MAXSIT];
	private Seat b[]=new Seat[MAXSIT];
	Scanner sc;
	Reservation(){
		for(int i=0;i<MAXSIT;i++) {
			s[i]=new Seat();
			a[i]=new Seat();
			b[i]=new Seat();
			sc =new Scanner(System.in);
		}
	}
	public void addSit(Seat sits[],int i,String name) {//���
		if(i>0&&i<=MAXSIT) {
			if(sits[--i].getResevation()) {
				System.out.println("�̹� ������ �ڸ��Դϴ�.");
			}
			else {
				sits[i].setName(name);
				sits[i].setResevation(true);
			}
		}
		else {
			System.out.println("�߸��� ���� ���� �Դϴ�.");
		}
	}
	public void removeSit(Seat sits[],String name) {//���� 
		int count=1;
		for(int i=0;i<sits.length;i++) {					
			if(name.equals(sits[i].getName())) {
				sits[i].setName("___");
				sits[i].setResevation(false);
				System.out.println("�����Ϸ�");
				break;// ���������� �� �ѻ���� �����ϱ� ����
			}
			else{
				count++;
			}
			if(count>10) {
				System.out.println("�߸��� �̸��� �Է��߽��ϴ�.");
			}
		}		
	}
	public void inputSitName() {
		System.out.print("�̸� >>");
		name=sc.nextLine();		
	}
	public void inputSitNum() {
		System.out.print("��ȣ>>");
		sitNum=Integer.parseInt(sc.nextLine());		
	}
	public void checkSitLine(Seat sits[]) {	// �� ���
		for(int i=0;i<sits.length;i++) {
			System.out.print(sits[i].getName()+" ");
		}
		System.out.println();
	}
	public void checkAllSitLine() {	// �� ���
		System.out.print("S >>");
		checkSitLine(s);
		System.out.print("A >>");
		checkSitLine(a);
		System.out.print("B >>");
		checkSitLine(b);
		System.out.println();
	}
	public void finish() {
		System.out.println("���α׷� ����");
		sc.close();
	}
	public void run() {
		System.out.println("�ڹ��ܼ�ƮȦ ����ý����Դϴ�.");
		int knum=0;		
		
		while(knum!=4) {
			System.out.println("����:1, ��ȸ:2, ���:3, ������:4 >>");
			knum=Integer.parseInt(sc.nextLine());
			if(knum==1) {
				System.out.println("�¼����� S(1), A(2), B(3)");
				int sitTNum=Integer.parseInt(sc.nextLine());
				if(sitTNum==1) {
					System.out.print("S >>");
					checkSitLine(s);
					inputSitName();
					inputSitNum();
					addSit(s,sitNum,name);						
				}
				else if(sitTNum==2) {
					System.out.print("A >>");
					checkSitLine(a);
					inputSitName();
					inputSitNum();
					addSit(a,sitNum,name);
				}
				else if(sitTNum==3) {
					System.out.print("B >>");
					checkSitLine(b);
					inputSitName();
					inputSitNum();
					addSit(b,sitNum,name);					
				}
				else {
					System.out.println("�� �� �Է��߽��ϴ�.");
				}

			}
			else if(knum==2) {
				checkAllSitLine();
			}
			else if(knum==3) {
				System.out.println("�¼����� S(1), A(2), B(3)");
				int sitTNum=Integer.parseInt(sc.nextLine());
				if(sitTNum==1) {
					System.out.print("S >>");
					checkSitLine(s);
					inputSitName();
					removeSit(s,name);
				}
				else if(sitTNum==2) {
					System.out.print("A >>");
					checkSitLine(a);				
					inputSitName();
					removeSit(a,name);
				}
				else if(sitTNum==3) {
					System.out.print("B >>");
					checkSitLine(b);
					inputSitName();
					removeSit(b,name);
				}
			}
			else if(knum==4) {
				finish();
			}
			else {
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�.");
			}
		}
	}
}
