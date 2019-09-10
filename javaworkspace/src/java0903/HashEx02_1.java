package java0903;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx02_1 {

	public static void main(String[] args) {
		//문제 1. 영한 사전 만들기
		//HashMap을 이용하여 10개의 단어를 영어, 한글의 쌍으로 저장하고
		//영어로 검색하는 프로그램을 만들어보세요.
		//단 , exit가 입력되면 프로그램 종료.
		Scanner sc = new Scanner(System.in);

		HashMap <String,String> map = new HashMap<>();
		map.put("apple", "사과");
		map.put("pear", "배");
		map.put("book", "책");
		map.put("paper", "종이");
		map.put("pants", "바지");
		map.put("table", "책상");
		map.put("water", "물");
		map.put("clock", "시계");
		map.put("extend", "확장하다");
		map.put("class", "교실");		

		System.out.println("영한 사전입니다.");
		while(true) {
			System.out.print("찾을 단어를 입력하세요. exit를 입력시 프로그램이 종료됩니다.");
			String eng = sc.nextLine();
			if(eng.equals("exit")) {
				break;
			}
			String kor = map.get(eng);
			if(kor==null)System.out.println(eng+"는 없는 단어 입니다.");
			else System.out.println(kor);
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();

	}
}