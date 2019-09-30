package javaBaekjoon0923;

import java.util.Scanner;

public class B10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int p = sc.nextInt();
			int floor = p%h;
			int room= (p/h)+1;
			if(p%h==0) {
				room = p/h;
				floor = h;
			}
			System.out.println(floor*100+room);
		}
		sc.close();
	}
}
