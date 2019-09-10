package java0903;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2,100);
		System.out.println(v);
		
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		// 벡터 내 모든 정수 더하기
		int sum = 0;
		for(int i =0;i<v.size();i++) {
			int n = v.elementAt(i);
			sum+=n;
		}
		System.out.println("백터 내 정수의 합 : "+sum);
	}
}
