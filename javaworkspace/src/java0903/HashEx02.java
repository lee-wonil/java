package java0903;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx02 {

	public static void main(String[] args) {
		//문제 1. 영한 사전 만들기
		//HashMap을 이용하여 10개의 단어를 영어, 한글의 쌍으로 저장하고
		//영어로 검색하는 프로그램을 만들어보세요.
		//단 , exit가 입력되면 프로그램 종료.
		Scanner sc = new Scanner(System.in);

		HashMap <String,String> map = new HashMap<>();
		map.put("reservation", "예약");
		map.put("typically", "보통");
		map.put("in public", "사람들이 있는 데서");
		map.put("multitude", "아주 많은 수");
		map.put("relative", "비교상의");
		map.put("cumulative", "누적되는");
		map.put("speculative", "추측에 근거한");
		map.put("legislative", "입법의");
		map.put("superlative", "최상의");
		map.put("manipulative", "조종하는");
		System.out.println("영한 사전입니다.");
		while(true) {
			System.out.print("찾을 단어를 입력하세요. exit를 입력시 프로그램이 종료됩니다.");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			if(map.containsKey(s)) {	// 찾은 경우
				System.out.println(s+"의 뜻은 "+map.get(s)+"입니다.");
			}
			else {
				System.out.println("해당 단어를 찾기 못했습니다.");				
			}

		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();

	}
}