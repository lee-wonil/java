package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	이름과 학점(4.5만점)을 5개 입력받아 해쉬맴에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하세요.
	실해예시:
		자바장학금관리시스템입니다.
		이름과 학점 >> 호크아이 3.1
		이름과 학점 >> 블랙위도우 3.6
		이름과 학점 >> 토르 2.9
		이름과 학점 >> 데드풀 3.7
		이름과 학점 >> 아이언맨 4.3
		장학생 선발 학점 기준 입력 >> 3.2
		장학생 명단 : 블랙위도우 데드풀 아이언맨
*/
class Scholarship{
	HashMap <String,Double> map;
	Scanner sc;
	Scholarship(String s){
		System.out.println(s+"관리시스템입니다.");
		map = new HashMap<>();
		sc = new Scanner(System.in);
	}
	void read() {
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점 >>");
			String input = sc.nextLine();
			String [] data = input.split(" ");
			String name = data[0];
			double score = Double.parseDouble(data[1]);
			map.put(name, score);
		}
	}
	void select() {
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double scoreLine = Double.parseDouble(sc.nextLine());
		Set keySet = map.keySet();
		Iterator it =keySet.iterator();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String name = (String)it.next();
			double yourscore = map.get(name);
			if(scoreLine<yourscore) {
				System.out.print(name+" ");
			}
		}
	}
}
public class Test36Ex_hashmap {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("자바장학금");
		sship.read();
		sship.select();

	}
}
