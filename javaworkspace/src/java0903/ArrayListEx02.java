package java0903;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02 {
	public static void main(String[] args) {
		//영문이름 4개를 입력받아 ArrayList에 저장하고
		//모두 출력한 후 제일 긴 이름을 출력하세요.
		Scanner sc= new Scanner(System.in);
		ArrayList<String>name = new ArrayList<>();
		final int SIZE = 4;		// 배열의 길이를 고정 시키기 위해 변수 선언 // 안해도 상관 없음
		for(int i=0;i<SIZE;i++) {
			System.out.println("이름을 입력하세요");
			String input = sc.nextLine();
			name.add(input);// ArrayList에 입력받은 데이터를 저장
		}
		System.out.println(name);// ArrayList 출력
		String max = name.get(0);// 가장 긴 이름을 출력하기 위한 변수 // 임시로 ArrayList의 첫번째 값을 넣어줌
		for(int i=0;i<SIZE;i++) {
			if(max.length()<name.get(i).length()) {	// max에 저장되어 있는 길이와 ArrayList의 i번째 인덱스의 길이를 비교해서 max의 값이 작은 경우
				max=name.get(i);					// max에 현재 인덱스의 값을 저장한다.
			}
		}
		System.out.println(max);
		sc.close();
	}
}
