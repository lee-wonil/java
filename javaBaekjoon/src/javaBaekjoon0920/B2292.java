package javaBaekjoon0920;

import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=1;
		int sum = 1;
		while(num>sum) {
			sum+=count++*6;
		}
		System.out.println(count);
		sc.close();
	}

}
