package java0903;

import java.util.Vector;

public class VectorEx04 {
	public static void main(String[] args) {
		
		Vector v = new Vector();		// ��� �� �ߴ� ������ �������� �ʴ� ����̱� �����̴�.
	
		v.add("Apple");			
		v.add("Orange");
		
		for(int i=0;i<v.size();i++) {
			String str = (String)v.get(i);	// Object Ÿ������ ���ϵǾ ����ȯ �ʼ�
			System.out.println(str);
		}
		
		for(Object s:v) {
			String str=(String)s; 	// ����ȯ ���� ������ ���� �߻�
			System.out.println(str.toUpperCase());
		}
		// ���׸� ���
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
