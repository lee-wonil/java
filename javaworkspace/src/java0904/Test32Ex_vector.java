package java0904;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
	Vector �÷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷��� �ۼ��ϼ���.
	�������� �Է��ϸ� ���Ϳ� �߰��ϰ� ���� �Էµ� ��� �������� ����� ����Ѵ�.
	���� ���� :
		������ �Է� (0 �Է½� ����)>>	5
		5
		���� ��� 5
		������ �Է� (0 �Է½� ����)>>	80
		5 80
		���� ��� 42
		������ �Է� (0 �Է½� ����)>>	53
		5 80 53
		���� ��� 46
		������ �Է� (0 �Է½� ����)>>	22
		5 80 53 22
		���� ��� 40
		������ �Է� (0 �Է½� ����)>>	0
		���α׷� ����!
*/
public class Test32Ex_vector {
	
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		Iterator<Integer> it;
		int sum=0;
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			int num = Integer.parseInt(sc.nextLine());
			if(num==0)break;
			v.add(num);
			it = v.iterator();
			while(it.hasNext()) {
				int a = it.next();
				sum+=a;
				System.out.print(a+" ");				
			}
			System.out.println();
			System.out.println("���� ��� :"+sum/v.size());
			sum=0;
		}
		System.out.println("���α׷� ����");
		sc.close();
		
	}
}
