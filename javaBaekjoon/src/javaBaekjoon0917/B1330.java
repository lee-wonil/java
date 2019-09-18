package javaBaekjoon0917;

import java.util.Scanner;
public class B1330 {

	public static void main(String[] args) {
		int a=0,b=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) System.out.println(">");
		else if(a==b) System.out.println("=");
		else System.out.println("<");
		sc.close();
	}
}
