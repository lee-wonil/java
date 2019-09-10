package java0902;

import java.util.Random;

public class MathEx01 {
	public static void main(String[] args) {
		//java.lang.Math()random()
		for(int i =0;i<10;i++) {
			int n = (int)(Math.random()*100+1);
			System.out.println(n);
		}
		// java.util.Ramdom 클래스
		Random r = new Random();
		int res = r.nextInt();	// 정수 범위 약-21억 ~ 약 21억사이 난수
		System.out.println(res);
		int res1 = r.nextInt(100);
		System.out.println(res1);
	}
}
