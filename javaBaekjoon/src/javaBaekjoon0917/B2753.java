package javaBaekjoon0917;

import java.util.Scanner;

public class B2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		if(a%4==0) {
			b=1;
		}
		if(a%100==0) {
			b=0;
		}
		if(a%400==0) {
			b=1;
		}
        System.out.println(b);
		sc.close();
	}
}
