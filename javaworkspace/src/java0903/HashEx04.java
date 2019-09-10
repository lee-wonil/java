package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	id와 tel(전화번호)로 구성되는 Student 클래스를 만들고,
	이름을 key, Student 객체를 값으로 하는 해쉬맵을 작성하세요.
	이름을 검색하면 id와 전화번호가 출력되고, exit를 입력하면 프로그램 종료.
 */
class Student{
	private int id;private String tel;
	Student(int id,String tel){
		this.id=id;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return "id : "+id+"\t전화번호 : "+tel;
	}
	public int getId() {
		return id;		
	}
	public String getTel() {
		return tel;				
	}
}
public class HashEx04 {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String,Student> data = new HashMap<>();
	public static void main(String[] args) {

		while(true) {
			System.out.println("1.삽입 2.전체조회 3.학생조회 4.종료(exit를 입력해도 종료 됩니다.)");
			System.out.print("원하시는 메뉴 번호를 입력하세요");
			String sel = sc.nextLine();
			if(sel.equals("1")) {
				add();
			}
			else if(sel.equals("2")) {
				showAll();
			}
			else if(sel.equals("3")) {
				find();
			}
			else if(sel.equals("4")||sel.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}

		}
	}
	public static void add() {
		System.out.print("삽입할 이름을 작성하세요");
		String name = sc.nextLine();
		System.out.println("학생의 아이디를 입력하세요");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("학생의 전화번호를 입력하세요");
		String tel = sc.nextLine();
		if(data.get(name)==null) {
			data.put(name, new Student(id,tel));
			System.out.println("저장완료");
		}
		else {
			System.out.println("이미 삽입 되어 있습니다.");
		}
	}
	public static void showAll() {
		System.out.println("전체조회를 선택하셨습니다.");
		Set<String> set = data.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println("이름 : "+name+" "+data.get(name));
		}
	}
	public static void find() {
		System.out.print("이름을 입력하세요");
		String name = sc.nextLine();
		if(data.get(name)==null) {
			System.out.println("해당 인물을 찾을 수 없습니다.");
			return;
		}
		System.out.println("이름 "+name+" "+data.get(name));
	}
	

}
