package javaBaekjoon0920;

import java.util.Scanner;

public class B1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(minnum(x,y));
		}
		sc.close();
	}
	public static int minnum(int x,int y) {
		int z = y-x;
		
		return x;
	}

}
