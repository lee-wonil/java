package javaBaekjoon0920;

import java.util.Scanner;

public class B1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int su = 0;
		int mo = 0;
		boolean b =false;		// �� �ݺ��ϱ� ���ؼ� ���� b�� false �� �и� 1���� ���� 1����
		for(int i=0;i<num;i++) {
			if(su==0&&mo==0) {	// ù ��
				mo++;
				su++;
			}
			else {		// �׿��� ��
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
