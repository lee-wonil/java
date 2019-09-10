package java0903;
import java.util.*;
public class VectorEx01 {
	public static void main(String[] args) {
		// # 백터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));	//원형
		v.add(new Integer(20));
		v.add(new Integer(30));
		// 자동 박싱
		v.add(100);	// new Integer(100)		
		v.add(200);
		v.add(300);
		
		v.add(null);// null 삽입 가능
		v.add(2,100);	// index, 요소
		
		// 백터 요소 꺼내기 : get(index), elementAt(index)		
		int i = v.get(1);
		Integer ii =v.get(1);
		System.out.println(i);
		System.out.println(ii);
		
		// 크기와 용량 꺼내기
		int len = v.size();
		System.out.println(len);
		int cap = v.capacity();
		System.out.println(cap);
		
		// 요소 삭제 : remove(index), remove(요소)
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		
		v.remove(new Integer(100));
		System.out.println(v);
		
		System.out.println(v.get(1));
		
		// 전체 삭제
		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.size());			// 사이즈는 전체 삭제시 0으로 초기화된다.
		System.out.println(v.capacity());		// 전체 삭제시 용량은 변하지 않는다.

	}
}
