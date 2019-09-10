package java0903;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class JavaScorePrg{
	// 인스턴스 변수
	private Scanner sc;
	private HashMap<String,Integer> data;
	public JavaScorePrg() {
		// 생성자 
		sc = new Scanner(System.in);
		data=new HashMap<>();
	}

	public void run() {
		System.out.println("**자바 성적 관리 프로그램**");
		while(true) {
			System.out.println("1.전체조회\n2.등록\n3.수정\n4.삭제\n5.전체평균\n6.프로그램종료");
			System.out.print("원하는 번호를 눌러주세요");
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
				System.out.println("잘못된 메뉴 번호입니다. 다시 입력하세요");
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
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		System.out.print("점수 >> ");
		int score = Integer.parseInt(sc.nextLine());
		Set<String> names = data.keySet();		// 동일이름 확인하게 이름들(key)가져와 확인
		if(names.contains(name)) {
			System.out.println("이미 존재하는 이름입니다. 이름을 다시 입력해주세요.");
			putData();
		}
		else {
			data.put(name, score);
			System.out.println("저장 완료");
		}
	}
	private void modifyData() {
		System.out.print("수정할 학생 이름 >> ");
		String name = sc.nextLine();
		Set <String> names = data.keySet();
		if(names.contains(name)) {
			System.out.print("새 점수 >>");
			int score = Integer.parseInt(sc.nextLine());
			data.put(name, score);
			System.out.println("수정 완료!");
		}
		else {
			System.out.println("존재하지 않는 학생입니다.");
		}
		
	}
	private void deleteDate() {
		System.out.print("삭제할 학생 이름 >> ");
		String name = sc.nextLine();
		Set <String> names = data.keySet();
		if(names.contains(name)) {
			data.remove(name);
			System.out.println("삭제 완료!");
		}
		else {
			System.out.println("존재하지 않는 학생입니다.");
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
		System.out.println("전체 평균 : "+aver);

	}
	private void finish() {
		System.out.println("시스템 종료!");
		sc.close();
	}
}
public class HashEx03_1 {

	public static void main(String[] args) {
		//HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램 작성
		// 아래 프로그램 메뉴에서 각 번호로 서비스 선택,
		// 6번을 입력받으면 프로그램 종료
		/*
		 **자바 성적 관리 프로그램**
		 	1.전체조회
		 	2.등록
		 	3.수정
		 	4.삭제
		 	5.전체평균
		 	6.프로그램종료
		 */			
		JavaScorePrg jsp = new JavaScorePrg();
		jsp.run();
	}
}
