package java0904;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
	Scanner Ŭ������ -1�� �Էµɶ����� ���� ������ �Է¹޾� ���Ϳ� �����ϰ�,
	���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���. 
	���࿹��:
		����>> 10 6 22 6 88 77 -1
		���� ū ���� 88
*/
public class Test29Ex_vector {
	
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����>>");
			int a = Integer.parseInt(sc.nextLine());
			if(a==-1) break;
			v.add(a);
		}
		int max = v.get(0);
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int e = it.next();
			if(max<e) {
				max=e;
			}
		}
		System.out.println("���� ū ���� "+max);
		sc.close();
	}
}
