package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	33Ex������ ArrayList<StudentClass>��� HashMap<String, StudentClass> �� �̿��Ͽ� �ٽ� �ۼ��غ�����. 
	�ؽ��ʿ��� Ű�� �л� �̸����� �Ѵ�.
 */
public class Test34Ex_hashmap {

	public static void main(String[] args) {
		Test34Ex_hashmap ex = new Test34Ex_hashmap();
		ex.run();
		System.out.println("���α׷� ����!!");
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentClass> map = new HashMap<>();
		StudentClass student;
		Set<String> keyset;
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
			System.out.print("�л��̸�>>");
			String name=sc.nextLine();
			if(name.equals("�׸�"))break;
			student = map.get(name);
			if(student !=null)
				student.print();
			else
				System.out.println("�ش� �л��� �����ϴ�.");
		}
		sc.close();
	}
}
