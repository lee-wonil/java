package javaBaekjoon0918;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a = new int[26];
		for(int i=0;i<a.length;i++) {
			a[i]=-1;			
		}
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int ac = c-97;
			if(a[ac]==-1)a[ac]=i;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
