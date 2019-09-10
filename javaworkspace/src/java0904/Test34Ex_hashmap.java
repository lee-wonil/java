package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	33Ex문제를 ArrayList<StudentClass>대신 HashMap<String, StudentClass> 을 이용하여 다시 작성해보세요. 
	해쉬맵에서 키는 학생 이름으로 한다.
 */
public class Test34Ex_hashmap {

	public static void main(String[] args) {
		Test34Ex_hashmap ex = new Test34Ex_hashmap();
		ex.run();
		System.out.println("프로그램 종료!!");
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentClass> map = new HashMap<>();
		StudentClass student;
		Set<String> keyset;
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
			map.put(name, student);
		}
		keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			student = map.get(key);
			student.printAll();
		}
		while(true) {
			System.out.print("학생이름>>");
			String name=sc.nextLine();
			if(name.equals("그만"))break;
			student = map.get(name);
			if(student !=null)
				student.print();
			else
				System.out.println("해당 학생은 없습니다.");
		}
		sc.close();
	}
}
