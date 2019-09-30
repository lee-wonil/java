package javaBaekjoon0920;

import java.util.Scanner;

public class B1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total=0;		
		for(int i=0;i<num;i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			long sub = y-x;
			int k=1;
			while(sub>0) {
				sub-=k;
				total++;
				if(sub<=0) {
					break;
				}
				sub-=k;
				total++;
				if(sub<=0) {
					break;
				}
				k++;
			}
			System.out.println(total);
			total=0;
		}
		
		sc.close();
	}
}
