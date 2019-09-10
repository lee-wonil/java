package java0828;

import java.util.Scanner;

// �������̽�
/*
	Stack �������̽��� ��ӹ޾� ���ڿ��� �����ϴ� StringStack Ŭ������ �����ϼ���. 
	�Ʒ��� ���� �������� �������� StackAppŬ������ main() �޼ҵ带 �ۼ��ϼ���. (���� �׳� ���ϸ� Ŭ�����ȿ� main �ۼ�)
	������:
		�� ���� ���� ������ ũ�� �Է� >>  3 (����ڰ� �Է�)
		���ڿ� �Է� >> hello
		���ڿ� �Է� >> sunny
		���ڿ� �Է� >> smile
		���ڿ� �Է� >> happy
		������ �� ���� Ǫ�� �Ұ�!
		���ڿ� �Է� >> �׸�
		���ÿ� ����� ��� ���ڿ� �� : smile sunny hello
*/
interface Stack {
	int length();					// ���� ���ÿ� ����� ���� ����
	int capacity();					// ������ ��ü ���� ������ ���� ����
	String pop();					// ������ ��(top)�� ����� ���ڿ� ���� 
	boolean push(String val);		// ������ ��(top)�� ���ڿ� ����
}
class StackApp implements Stack{
	Scanner sc;
	private int size;
	private int count=0;
	private String[] words;
	public StackApp(){
		sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		size = Integer.parseInt(sc.nextLine());		
		words = new String[size];
	}
	@Override
	public int length() {
		return capacity()-count;
	}
	@Override
	public int capacity() {
		return words.length;
	}
	@Override
	public String pop() {
		String s =words[--count];
		words[count]=null;
		return s;
	}
	@Override
	public boolean push(String val) {
		if(length()>0) {
			words[count++]=val;
			return true;
		}
		else return false;
	}
	public void run() {		
		while(true) {
			System.out.print("���ڿ� �Է� >>");
			String input=sc.nextLine();
			if(input.equals("�׸�")) {				
				break;
			}
			if(!push(input)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
			
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int i=count-1;i>=0;i--) {
			System.out.print(pop()+" ");
		}
		sc.close();
	}
}


public class ClassTest68Ex {
	public static void main(String[] args) {
		StackApp s = new StackApp();
		s.run();

	}
}


