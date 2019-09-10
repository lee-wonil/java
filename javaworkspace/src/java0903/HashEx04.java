package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	id�� tel(��ȭ��ȣ)�� �����Ǵ� Student Ŭ������ �����,
	�̸��� key, Student ��ü�� ������ �ϴ� �ؽ����� �ۼ��ϼ���.
	�̸��� �˻��ϸ� id�� ��ȭ��ȣ�� ��µǰ�, exit�� �Է��ϸ� ���α׷� ����.
 */
class Student{
	private int id;private String tel;
	Student(int id,String tel){
		this.id=id;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return "id : "+id+"\t��ȭ��ȣ : "+tel;
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
			System.out.println("1.���� 2.��ü��ȸ 3.�л���ȸ 4.����(exit�� �Է��ص� ���� �˴ϴ�.)");
			System.out.print("���Ͻô� �޴� ��ȣ�� �Է��ϼ���");
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
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}

		}
	}
	public static void add() {
		System.out.print("������ �̸��� �ۼ��ϼ���");
		String name = sc.nextLine();
		System.out.println("�л��� ���̵� �Է��ϼ���");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("�л��� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = sc.nextLine();
		if(data.get(name)==null) {
			data.put(name, new Student(id,tel));
			System.out.println("����Ϸ�");
		}
		else {
			System.out.println("�̹� ���� �Ǿ� �ֽ��ϴ�.");
		}
	}
	public static void showAll() {
		System.out.println("��ü��ȸ�� �����ϼ̽��ϴ�.");
		Set<String> set = data.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println("�̸� : "+name+" "+data.get(name));
		}
	}
	public static void find() {
		System.out.print("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		if(data.get(name)==null) {
			System.out.println("�ش� �ι��� ã�� �� �����ϴ�.");
			return;
		}
		System.out.println("�̸� "+name+" "+data.get(name));
	}
	

}
