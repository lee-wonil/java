//https://www.acmicpc.net/problem/11654
//주어진 글자를 아스키 코드로 변환
package javaBaekjoon0917;

import java.util.Scanner;

public class B11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = s.charAt(0);
		int d = c;
		System.out.println(d);
		sc.close();
	}
}
