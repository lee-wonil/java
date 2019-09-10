package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashEx01 {
	public static void main(String[] args) {
		//생성
		HashMap<String, String> map = new HashMap<>();
		
		//요소 삽입
		map.put("Apple","사과" );
		map.put("Strawberry","딸기" );
		map.put("Watermelon","수박" );
		map.put("Peach","복숭아" );
		
		// 값 꺼내기
		String res1 = map.get("Strawberry");
		System.out.println(res1);
		String res2= map.get("Peach");
		System.out.println(res2);
		String res3= map.get("Melon");
		System.out.println(res3);
		
		//삭제
		map.remove("Apple");
		System.out.println(map);
		
		// 요소 개수 알아내기
		int size = map.size();
		System.out.println(size);
		
		// 해쉬맵 전체 검색	: 모든 키를 알아낸 후, 각 키에 대한 값을 꺼내오는 방식. keySet()
		Set <String> set= map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println("key :"+key+"\t value :"+val);
		}
	}
}
