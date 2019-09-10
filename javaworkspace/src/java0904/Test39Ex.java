package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	나라와 수도 맞추기 게임을 만들어 보세요. (코드 하나도 없는 문제)
	1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
		ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
	실행예시:
 ** 수도 맞추기 게임을 시작합니다 **
		입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
		현재 8개의 나라와 수도가 입력되어 있습니다.
		나라와 수도 입력9>> 한국 서울
		나라와 수도 입력10>> 그리스 아테네
		그리스는 이미 있습니다!!
		나라와 수도 입력10>> 호주 시드니
		나라와 수도 입력11>> 이탈리아 로마
		나라와 수도 입력10>> 그만
		입력:1, 퀴즈:2, 종료:3 >> 2
		호수의 수도는? 시드니
		정답!!
		독일의 수도는? 하얼빈
		아닙니다!!
		멕시코의 수도는? 하얼빈
		아닙니다!!
		이탈리아의 수도는? 로마
		정답!!
		한국의 수도는? 서울
		정답!!
		영국의 수도는? 그만
		입력:1, 퀴즈:2, 종료:3 >> 3
		게임을 종료합니다.
 */
class CapitalGame{
	HashMap <String,String> map;
	Scanner sc ;
	String country;
	String capital;
	CapitalGame(){
		map = new HashMap<>();
		sc = new Scanner(System.in);
		System.out.println("** 수도 맞추기 게임을 시작합니다 **");
	}
	void run() {
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==1) addList();
			else if(sel==2) quiz();
			else if(sel==3) return;
			else System.out.println("잘 못 입력했습니다.");
		}
	}
	void addList() {
		System.out.println("현재 "+map.size()+"개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.print("나라와 수도 입력"+(map.size()+1)+">>");
			String input = sc.nextLine();
			if(input.equals("그만")) return;
			String [] data = input.split(" ");
			country= data[0];
			capital=data[1];
			if(map.get(country)!=null) {
				System.out.println(country+"는 이미 있습니다!!");				
			}
			else {
				map.put(country, capital);
			}
		}
	}
	void quiz() {
		if(map.isEmpty()) {
			System.out.println("현재 리스트가 비어 있어 게임 시작이 불가능 합니다.");
			return;
		}
		while(true) {
			Set <String>set = map.keySet();
			Iterator<String> it =set.iterator();
			int random = (int)(Math.random()*map.size());
			for(int i =0;i<random;i++) {
				it.next();
			}
			country = it.next();
			capital = map.get(country);
			System.out.println(country+"의 수도는?");
			String input = sc.nextLine();
			if(input.equals("그만")) return;
			if(input.equals(capital))System.out.println("정답");
			else	System.out.println("아닙니다!!");
		}
	}

}


public class Test39Ex {
	public static void main(String[] args) {

		CapitalGame game = new CapitalGame();
		game.run();
		System.out.println("게임 종료");
	}
}
