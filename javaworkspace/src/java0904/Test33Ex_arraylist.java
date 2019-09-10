package java0904;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
	�ϳ��� �л� ������ ��Ÿ���� StudentClass���� �̸�, �а�, �й�, ���� ����� �����ϴ� �ʵ尡 �ִ�. 
	�л����� StudentClass ��ü�� �����ϰ� 4���� �л������� ArrayList<StudentClass> �÷��ǿ� ������ �Ŀ�,
	ArrayList<StudentClass>�� ��� �л�(4��) ������ ����ϰ� 
	�л� �̸��� �Է¹޾� �ش� �л��� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	���࿹��:
		�л��̸�, �а�, �й�, ������� �Է��ϼ���.
		>> ȣũ����,�����,1,4.1
		>> ����Ǯ,�ȵ���̵�,2,3.9
		>> ��ũ,������,3,3.5
		>> ���̾��,������,4,4.25
		---------------------------
		�̸�:ȣũ����
		�а�:�����
		�й�:1
		�������:4.1
		---------------------------
		�̸�:����Ǯ
		�а�:�ȵ���̵�
		�й�:2
		�������:3.9
		---------------------------
		�̸�:��ũ
		�а�:������
		�й�:3
		�������:3.5
		---------------------------
		�̸�:���̾��
		�а�:������
		�й�:4
		�������:4.25
		---------------------------
		�л� �̸� >> ���̾�� 
		���̾��, ������, 4, 4.25
		�л� �̸� >> ����Ǯ
		����Ǯ, �ȵ���̵�, 2, 3.9
		�л� �̸� >> �׸� 
		���α׷� ����!
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
		System.out.println("�̸�:"+name);
		System.out.println("�а�:"+major);
		System.out.println("�й�:"+id);
		System.out.println("�������:"+score);
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
		System.out.println("���α׷� ����!");
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		ArrayList <StudentClass> array = new ArrayList<>();
		StudentClass student;
		Iterator<StudentClass> it;
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���.");
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
			System.out.print("�л��̸�>>");
			String name=sc.nextLine();
			if(name.equals("�׸�")) break;
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
