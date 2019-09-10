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
	public void addSit(Seat sits[],int i,String name) {//등록
		if(i>0&&i<=MAXSIT) {
			if(sits[--i].getResevation()) {
				System.out.println("이미 선점된 자리입니다.");
			}
			else {
				sits[i].setName(name);
				sits[i].setResevation(true);
			}
		}
		else {
			System.out.println("잘못된 숫자 범위 입니다.");
		}
	}
	public void removeSit(Seat sits[],String name) {//삭제 
		int count=1;
		for(int i=0;i<sits.length;i++) {					
			if(name.equals(sits[i].getName())) {
				sits[i].setName("___");
				sits[i].setResevation(false);
				System.out.println("삭제완료");
				break;// 동명이인일 시 한사람만 삭제하기 위함
			}
			else{
				count++;
			}
			if(count>10) {
				System.out.println("잘못된 이름을 입력했습니다.");
			}
		}		
	}
	public void inputSitName() {
		System.out.print("이름 >>");
		name=sc.nextLine();		
	}
	public void inputSitNum() {
		System.out.print("번호>>");
		sitNum=Integer.parseInt(sc.nextLine());		
	}
	public void checkSitLine(Seat sits[]) {	// 열 출력
		for(int i=0;i<sits.length;i++) {
			System.out.print(sits[i].getName()+" ");
		}
		System.out.println();
	}
	public void checkAllSitLine() {	// 열 출력
		System.out.print("S >>");
		checkSitLine(s);
		System.out.print("A >>");
		checkSitLine(a);
		System.out.print("B >>");
		checkSitLine(b);
		System.out.println();
	}
	public void finish() {
		System.out.println("프로그램 종료");
		sc.close();
	}
	public void run() {
		System.out.println("자바콘서트홀 예약시스템입니다.");
		int knum=0;		
		
		while(knum!=4) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			knum=Integer.parseInt(sc.nextLine());
			if(knum==1) {
				System.out.println("좌석구분 S(1), A(2), B(3)");
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
					System.out.println("잘 못 입력했습니다.");
				}

			}
			else if(knum==2) {
				checkAllSitLine();
			}
			else if(knum==3) {
				System.out.println("좌석구분 S(1), A(2), B(3)");
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
				System.out.println("잘못된 숫자를 입력했습니다.");
			}
		}
	}
}
