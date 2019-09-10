package java0904;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
	ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
	평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		6개의 학점을 입력(A/B/C/D/F)>>	 A C A B F D
		2.3333333333333335
*/
// 수정해야됨
public class Test30Ex_arraylist {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		String str = sc.nextLine();
		String [] scores = str.split(" ");
		ArrayList<String> array = new ArrayList<>();
		for(int i =0;i<scores.length;i++) {
			array.add(scores[i]);
		}
		int sum=0;
		boolean data=true;
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			String score = it.next();
			if(score.equals("A")) {
				sum+=4;
			}else if(score.equals("B")) {
				sum+=3;
			}else if(score.equals("C")) {
				sum+=2;
			}else if(score.equals("D")) {
				sum+=1;
			}else if(score.equals("F")) {
				sum+=0;
			}else {
				System.out.println("잘못된 값이 입력이 되어 있습니다.");
				data=false;
				break;
			}		
		}		
		if(data==true) {
			System.out.println((double)sum/scores.length);
		}else {
			System.out.println("잘못된 값이 입력이 되어 계산을 할 수 없습니다..");
		}
		sc.close();
	}
}
