package javaTest.java09;
import java.util.*;
class HashMapEx1{
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("java", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
//		map.put(100, "abcd");
		System.out.println(map);

		Scanner s = new Scanner(System.in);
		// 화면으로부터 라인단위로 입력받는다.
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
				 System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");						
					break;
				}}} } }