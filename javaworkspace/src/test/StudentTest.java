package test;

import java.util.*;
class Student implements Comparable{
	private int grade;
	private String name;
	Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public int compareTo(Object obj) {
		Student s = (Student)obj;
		// 내림차순
		/*
		if(s.grade>grade) return 1;
		else if(s.grade<grade) return -1;
		else return 0;
		*/
		//오름차순
		if(s.grade>grade) return -1;
		else if(s.grade<grade) return 1;
		else return 0;
	}
}
public class StudentTest {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요");
		int num=Integer.parseInt(sc.nextLine());
		Student s[] = new Student[num];
		for(int i=0;i<s.length;i++) {
			System.out.print((i+1)+"번째 학생의 이름을 입력하세요>>");
			String name = sc.nextLine();
			System.out.print("성적을 입력하세요>>");
			int grade=Integer.parseInt(sc.nextLine());
			s[i]=new Student(name,grade);
		}
		Arrays.sort(s);
		System.out.println("성적순 오름차순 정렬입니다.");		
		for(int i=0;i<s.length;i++) {
			System.out.println("이름 : "+s[i].getName()+" 성적 :"+s[i].getGrade());
		}		
	}	
}
