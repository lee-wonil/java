package java0903;

import java.util.Vector;

public class VectorEx04 {
	public static void main(String[] args) {
		
		Vector v = new Vector();		// 노란 줄 뜨는 이유는 권장하지 않는 방법이기 때문이다.
	
		v.add("Apple");			
		v.add("Orange");
		
		for(int i=0;i<v.size();i++) {
			String str = (String)v.get(i);	// Object 타입으로 리턴되어서 형변환 필수
			System.out.println(str);
		}
		
		for(Object s:v) {
			String str=(String)s; 	// 형변환 하지 않으면 에러 발생
			System.out.println(str.toUpperCase());
		}
		// 제네릭 사용
		Vector<String> vec = new Vector<>();		
		
		vec.add("Apple");			
		vec.add("Orange");
		
		for(int i=0;i<vec.size();i++) {
			String str = vec.get(i);	
			System.out.println(str);
		}

		for(String s : vec) {
			System.out.println(s.toUpperCase());
		}
		
		
	}
}
