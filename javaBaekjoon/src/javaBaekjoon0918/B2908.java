package javaBaekjoon0918;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=change(a);
		b=change(b);
		if(a>b)System.out.println(a);
		else System.out.println(b);
		sc.close();
	}
	static int change (int a) {
		int num=0;
		num+=(a/100);
		num+=((a/10)%10)*10;
		num+=(a%10)*100;
		return num;
	}

}
