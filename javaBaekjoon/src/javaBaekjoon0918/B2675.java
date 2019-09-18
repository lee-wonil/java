package javaBaekjoon0918;

import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		
		for(int i =0;i<num;i++) {
			int p = sc.nextInt();
			String str = sc.nextLine();
			String result="";
			for(int j=1;j<str.length();j++) {				
				for(int k=0;k<p;k++) {
					result+=str.charAt(j);
				}
			}
			System.out.println(result);
			result=" ";			
		}
		sc.close();
	}
}
