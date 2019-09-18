package javaBaekjoon0917;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>45) {
			b-=45;
		}
		else {
			a--;
			b+=60;
			b-=45;
		}
		if(a==-1) a=23;
		System.out.println(a+" "+b);
		sc.close();

	}

}
