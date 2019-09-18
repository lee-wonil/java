package javaBaekjoon0917;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		num[0]=sc.nextInt();
		int max = num[0];
		int maxidx = 1;
		for(int i=1;i<num.length;i++) {
			num[i]=sc.nextInt();
			if(max<num[i]) {
				max=num[i];
				maxidx=i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxidx);
		sc.close();
	}

}
