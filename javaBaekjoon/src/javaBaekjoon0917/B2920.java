package javaBaekjoon0917;

import java.util.Scanner;

public class B2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[8]; 
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int index=0;
		if(num[index]==1) {
			boolean c = false;
			for(index=1;index<8;index++) {
				if(num[index]!=index+1) {
					System.out.println("mixed");
					c= true;
					break;
				}
			}
			if(!c) {
				System.out.println("ascending");
			}
		}
		else if(num[index]==8) {
			boolean c = false;
			for(index=1;index<8;index++) {
				if(num[index]!=8-index) {
					System.out.println("mixed");
					c= true;
					break;
				}
			}
			if(!c) {
				System.out.println("descending");
			}
		}
		else {
			System.out.println("mixed");
		}
		sc.close();
	}

}
