package java0904;

import java.util.HashMap;
import java.util.Scanner;

/*
	"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
	다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 아래 해쉬맵을 이용하세요.
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	실행예시 :
		나라 이름과 인구를 입력하세요.(예: Korea 5000)
		나라 이름, 인구 >>  Korea 5000
		나라 이름, 인구 >>  USA 1000000
		나라 이름, 인구 >>  Swiss 2000
		나라 이름, 인구 >>  France 3000
		나라 이름, 인구 >>  그만
		인구 검색 >> France
		France의 인구는 3000
		인구 검색 >> 스위스
		스위스 나라는 없습니다.
		인구 검색 >> 그만
		프로그램 종료!
 */
public class Test31Ex_hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요");
		while(true) {
			System.out.print("나라 이름, 인구 >>");
			String input = sc.nextLine();
			if(input.equals("그만")) break;
			String [] data = input.split(" ");
			String country = data[0];
			int population = Integer.parseInt(data[1]);			
			nations.put(country, population);
		}		
		while(true) {
			System.out.print("인구 검색>>");
			String country = sc.nextLine();
			if(country.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			Integer population = nations.get(country);
			if(population!=null)
				System.out.println(country+"의 인구는 "+ population);
			else
				System.out.println(country+" 나라는 없습니다. ");
		}
		sc.close();


	}
}
