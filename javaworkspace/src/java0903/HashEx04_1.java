package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
	id�� tel(��ȭ��ȣ)�� �����Ǵ� Student Ŭ������ �����,
	�̸��� key, Student ��ü�� ������ �ϴ� �ؽ����� �ۼ��ϼ���.
	�̸��� �˻��ϸ� id�� ��ȭ��ȣ�� ��µǰ�, exit�� �Է��ϸ� ���α׷� ����.
 */
/*class Student{
	private String id;private String tel;
	Student(String id,String tel){
		this.id=id;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return "id : "+id+"\t��ȭ��ȣ : "+tel;
	}
}
*/
public class HashEx04_1 {

	 
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put("���̾��", new Student(1,"010-1111-2222"));
		map.put("�丣", new Student(2,"010-3333-4444"));
		map.put("���̾��", new Student(3,"010-5555-6666"));
		
		while(true) {
			System.out.println("�˻��� �̸� �Է�");
			String name = sc.nextLine();
			if(name.equals("exit"))	break;
			else {				
				Student s = map.get(name);
				if(s==null) System.out.println(name+"�� ���� ���");
				else System.out.println("id : "+s.getId()+", ��ȭ : "+s.getTel());
			}
		}
		
		/*
		// �̸� �Է¹ް� id/tel �Է¹޾� ��ü����
		System.out.print("�̸� �Է�");
		String name = sc.nextLine();
		Set <String> keys = data.keySet();
		if(keys.contains(name)) {System.out.println("�ߺ��� �̸��� �ֽ��ϴ�.");}
		else {
			System.out.print("id�Է�");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("��ȭ��ȣ �Է�");
			String tel = sc.nextLine();
			data.put(name, new Student(id,tel));
		}
		*/
		
		
	}
}
