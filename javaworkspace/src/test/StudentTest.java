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
		// ��������
		/*
		if(s.grade>grade) return 1;
		else if(s.grade<grade) return -1;
		else return 0;
		*/
		//��������
		if(s.grade>grade) return -1;
		else if(s.grade<grade) return 1;
		else return 0;
	}
}
public class StudentTest {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л����� �Է��ϼ���");
		int num=Integer.parseInt(sc.nextLine());
		Student s[] = new Student[num];
		for(int i=0;i<s.length;i++) {
			System.out.print((i+1)+"��° �л��� �̸��� �Է��ϼ���>>");
			String name = sc.nextLine();
			System.out.print("������ �Է��ϼ���>>");
			int grade=Integer.parseInt(sc.nextLine());
			s[i]=new Student(name,grade);
		}
		Arrays.sort(s);
		System.out.println("������ �������� �����Դϴ�.");		
		for(int i=0;i<s.length;i++) {
			System.out.println("�̸� : "+s[i].getName()+" ���� :"+s[i].getGrade());
		}		
	}	
}
