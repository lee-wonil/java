package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx03 {
	static HashMap<String, Integer> map = new HashMap<>();		// 클래스 변수 Hashmap 타입의 map 선언
	static Scanner sc = new Scanner(System.in);					// 클래스 변수 Scanner 타입의 sc	선언
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
		System.out.println("**자바 성적 관리 프로그램**");
		while(true) {
			System.out.println("1.전체조회");
			System.out.println("2.등록");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.전체평균");
			System.out.println("6.프로그램종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요.");
			int a = Integer.parseInt(sc.nextLine());
			if(a==1) {
				findAll();		//static 메서드 호출
			}
			else if(a==2) {
				add();			//static 메서드 호출
			}
			else if(a==3) {
				change();		//static 메서드 호출
			}
			else if(a==4) {
				delete();		//static 메서드 호출
			}
			else if(a==5) {
				average();		//static 메서드 호출
			}
			else if(a==6) {
				break;			//6입력시 종료
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	public static void findAll() {
		Set<String> set = map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			System.out.println(key+"학생의 점수는 "+val+"입니다.");			
		}
	}
	public static void add() {
		System.out.print("이름을 입력하세요");
		String name = sc.nextLine();
		if(map.containsKey(name)) {	// 중복되는 이름이 있는 경우
			System.out.println("이미 있는 이름 입니다.");
			return;
		}
		System.out.print("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		map.put(name, score);
	}
	public static void change() {
		System.out.print("점수를 바꿀 학생의 이름을 입력하세요");
		String name = sc.nextLine();
		if(map.containsKey(name)) {	// 중복되는 이름이 있는 경우
			System.out.print("점수를 입력하세요");
			int score = Integer.parseInt(sc.nextLine());
			map.put(name, score);
		}
		else {
			System.out.println("학생이 존재하지 않습니다.");
		}		
	}
	public static void delete() {
		System.out.print("삭제할 학생의 이름을 입력하세요");
		String name = sc.nextLine();
		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println("삭제완료");
		}
		else {
			System.out.println("학생이 존재하지 않습니다.");
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
		System.out.println("전체 평균은 "+d+"입니다.");
	}
}
