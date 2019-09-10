package java0903;

import java.util.ArrayList;
import java.util.Iterator;

public class IterEx01 {
	public static void main(String[] args) {
		ArrayList <Integer> array = new ArrayList<>();
		for(int i =1;i<10;i++) {
			array.add(i);
		}
		//반복자 생성
		//ArrayList에 존재하는 Iterator() 메서드를 호출하여
		//a의 각 요소를 순차적으로 검색/접근 할수 있는 Iterator객체를 얻는다.
		Iterator<Integer> iter = array.iterator();
		while(iter.hasNext()) {	//iter로 ArrayList의 요소 끝까지 반복
			int a = iter.next();
			if(a%2==0) {
				iter.remove();
			}
		}
		System.out.println(array);
		
		// 다시사용하려면 Iterator() 다시 가져와야 한다.
		iter = array.iterator();
	}
	
}
