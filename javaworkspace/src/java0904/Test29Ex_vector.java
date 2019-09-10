package java0904;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
	벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
	실행예시:
		정수>> 10 6 22 6 88 77 -1
		가장 큰 수는 88
*/
public class Test29Ex_vector {
	
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수>>");
			int a = Integer.parseInt(sc.nextLine());
			if(a==-1) break;
			v.add(a);
		}
		int max = v.get(0);
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int e = it.next();
			if(max<e) {
				max=e;
			}
		}
		System.out.println("가장 큰 수는 "+max);
		sc.close();
	}
}
