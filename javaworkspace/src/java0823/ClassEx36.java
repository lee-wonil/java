package java0823;

import java.util.Scanner;

/*
하루할일을 표현하는 클래스 Day는 다음과 같다. 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요.
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라. 
 -> 생성자, input(), view(), finish(), run() 메소드 만들기. 
#실행예시#
이번달 스케쥴 관리 프로그램. 
할일(입력:1, 보기:2, 끝내기:3) >> 1
날짜(1~30)? 1
할일? 자바공부

할일(입력:1, 보기:2, 끝내기:3) >> 2
날짜(1~30)? 1
1일의 할 일은 자바공부입니다.

할일(입력:1, 보기:2, 끝내기:3) >> 3
프로그램 종료.
*/
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.println("이번달 스케쥴 관리 프로그램." );
		int knum=0;
		while(knum!=3) {//3입력시 종료
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
	public void input() {
		System.out.print("날짜(1~"+day+")?");
		int daycount=Integer.parseInt(sc.nextLine());		
		daycount--;// 사용자로 부터 1부터 30까지 숫자중 하나를 입력 받지만 배열에는 0~day-1까지 조회가 된다.
		if(daycount<0||daycount>day) {
			System.out.println("날짜가 잘못 입력되었습니다.");
			return;
		}
		System.out.print("할일?");
		String work=sc.nextLine();
		days[daycount]=new Day();
		days[daycount].set(work);
	}
	public void view() {
		System.out.print("날짜(1~"+day+")?");
		int daycount=Integer.parseInt(sc.nextLine());
		daycount--;
		if(daycount<0||daycount>day) {
			System.out.println("날짜가 잘못 입력되었습니다.");
			return;
		}
		System.out.print(daycount+"일의 할 일은 ");
		days[daycount].show();
	}
	public void finish() {
		sc.close();//close()한번하면 다시 객체 생성해도 사용불가
		System.out.println("프로그램 종료");
	}
}

public class ClassEx36 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}

}
