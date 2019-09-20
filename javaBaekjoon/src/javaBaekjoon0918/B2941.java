package javaBaekjoon0918;

import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cAp[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String input = sc.nextLine();
		for(int i=0;i<cAp.length;i++) {
			if(input.contains(cAp[i])) {
				input=input.replaceAll(cAp[i], "+");
			}
		}
		System.out.println(input.length());
		sc.close();
	}
}
