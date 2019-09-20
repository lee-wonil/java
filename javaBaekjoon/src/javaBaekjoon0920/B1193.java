package javaBaekjoon0920;

import java.util.Scanner;

public class B1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int su = 0;
		int mo = 0;
		boolean b =false;		// 비교 반복하기 위해서 생성 b가 false 면 분모 1감소 분자 1증가
		for(int i=0;i<num;i++) {
			if(su==0&&mo==0) {	// 첫 비교
				mo++;
				su++;
			}
			else {		// 그외의 비교
				if(b) {
					if(mo==1) {
						b=false;
						su++;
					}
					else {
						su++;
						mo--;
					}
				}
				else {
					if(su==1) {
						b=true;
						mo++;
					}
					else {
						su--;
						mo++;
					}					
				}
			}
		}		
		System.out.println(su+" / "+mo);
	}
}
