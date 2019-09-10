package java0903;

import java.util.Iterator;
import java.util.Vector;

public class IterEx02 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);		
		v.add(2,100);
		Iterator<Integer> it= v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it =v.iterator();		// 다시 사용할때는 반복자를 다시 받아와야함.
		int sum=0;
		while(it.hasNext()) {
			sum+=it.next();
		}
		System.out.println("합계 : "+sum);
		
		
		
		
		
		
	}
}
