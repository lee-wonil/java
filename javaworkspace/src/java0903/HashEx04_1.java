package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
	id와 tel(전화번호)로 구성되는 Student 클래스를 만들고,
	이름을 key, Student 객체를 값으로 하는 해쉬맵을 작성하세요.
	이름을 검색하면 id와 전화번호가 출력되고, exit를 입력하면 프로그램 종료.
 */
/*class Student{
	private String id;private String tel;
	Student(String id,String tel){
		this.id=id;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return "id : "+id+"\t전화번호 : "+tel;
	}
}
*/
public class HashEx04_1 {

	 
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put("아이언맨", new Student(1,"010-1111-2222"));
		map.put("토르", new Student(2,"010-3333-4444"));
		map.put("아이언맨", new Student(3,"010-5555-6666"));
		
		while(true) {
			System.out.println("검색할 이름 입력");
			String name = sc.nextLine();
			if(name.equals("exit"))	break;
			else {				
				Student s = map.get(name);
				if(s==null) System.out.println(name+"은 없는 사람");
				else System.out.println("id : "+s.getId()+", 전화 : "+s.getTel());
			}
		}
		
		/*
		// 이름 입력받고 id/tel 입력받아 객체생성
		System.out.print("이름 입력");
		String name = sc.nextLine();
		Set <String> keys = data.keySet();
		if(keys.contains(name)) {System.out.println("중복된 이름이 있습니다.");}
		else {
			System.out.print("id입력");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("전화번호 입력");
			String tel = sc.nextLine();
			data.put(name, new Student(id,tel));
		}
		*/
		
		
	}
}
