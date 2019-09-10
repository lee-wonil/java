package java0903;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
	
	public static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));	// 기본형보다는 참조형은 참조형끼리 사용하는 것이 좋다.
		
		list1.add(new Integer(4));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		ArrayList list2 = new ArrayList(list1.subList(2, 4));	// 인덱스 번호를 지정해서 복사해서 넣는다.
		//System.out.println(list1,list2);
		print(list1,list2);
		System.out.println(list1.size());
		System.out.println(list2.size());
		Collections.sort(list1);
		print(list1,list2);
		System.out.println(list1.containsAll(list2));	// 지정된 요소가 모두 포함되어 있는지 확인
		list2.add("A");
		list2.add("B");
		print(list1,list2);
		
		list2.set(3, "abc");
		print(list1,list2);
		System.out.println(list1.retainAll(list2));
		print(list1,list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for(int i=list1.size();i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);

		
	}
}
