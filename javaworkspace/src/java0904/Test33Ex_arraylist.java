package java0904;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
	하나의 학생 정보를 나타내는 StudentClass에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다. 
	학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 ArrayList<StudentClass> 컬렉션에 저장한 후에,
	ArrayList<StudentClass>의 모든 학생(4명) 정보를 출력하고 
	학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		학생이름, 학과, 학번, 학점평균 입력하세요.
		>> 호크아이,모바일,1,4.1
		>> 데드풀,안드로이드,2,3.9
		>> 헐크,웹개발,3,3.5
		>> 아이언맨,빅데이터,4,4.25
		---------------------------
		이름:호크아이
		학과:모바일
		학번:1
		학점평균:4.1
		---------------------------
		이름:데드풀
		학과:안드로이드
		학번:2
		학점평균:3.9
		---------------------------
		이름:헐크
		학과:웹개발
		학번:3
		학점평균:3.5
		---------------------------
		이름:아이언맨
		학과:빅데이터
		학번:4
		학점평균:4.25
		---------------------------
		학생 이름 >> 아이언맨 
		아이언맨, 빅데이터, 4, 4.25
		학생 이름 >> 데드풀
		데드풀, 안드로이드, 2, 3.9
		학생 이름 >> 그만 
		프로그램 종료!
 */
class StudentClass{
	private String name;
	private String major;
	private int id;
	private double score; 
	public StudentClass(String name, String major, int id, double score) {
		this.name=name;
		this.major=major;
		this.id=id;
		this.score=score;
	}
	public void printAll() {
		System.out.println("이름:"+name);
		System.out.println("학과:"+major);
		System.out.println("학번:"+id);
		System.out.println("학점평균:"+score);
		System.out.println("------------------------");
	}
	public boolean findName(String name) {
		if(this.name.equals(name))
			return true;
		else
			return false;
	}
	public void print() {
		System.out.println(name+","+major+","+id+","+score);
	}
	public String getName() {
		return name;
	}
}

public class Test33Ex_arraylist {

	public static void main(String[] args) {
		Test33Ex_arraylist ex = new Test33Ex_arraylist();
		ex.run();
		System.out.println("프로그램 종료!");
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		ArrayList <StudentClass> array = new ArrayList<>();
		StudentClass student;
		Iterator<StudentClass> it;
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i =0;i<4;i++) {
			System.out.print(">>");
			String input = sc.nextLine();
			String [] data = input.split(",");
			String name = data[0];
			String major = data[1];
			int id = Integer.parseInt(data[2]);
			double score = Double.parseDouble(data[3]);
			student = new StudentClass(name,major,id,score);
			array.add(student);
		}
		for(int i=0;i<array.size();i++) {
			student = array.get(i);
			student.printAll();
		}
		while(true) {
			System.out.print("학생이름>>");
			String name=sc.nextLine();
			if(name.equals("그만")) break;
			it = array.iterator();
			while(it.hasNext()) {
				student = it.next();
				if(student.findName(name)) {
					student.print();
				}
			}
		}
		sc.close();
	}
}
