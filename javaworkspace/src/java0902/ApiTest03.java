package java0902;

class EqClass{
	int x, y;
	public EqClass(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

public class ApiTest03 {
	public static void main(String[] args) {
		/*
		//��ü ���� == �����ڷ� ���ϸ�, ���۷��� ��(���� �޸𸮻� ��ü�� ����Ű����)
		EqClass a = new EqClass(1,2);
		EqClass b = new EqClass(1,2);
		EqClass c = a;
		if(a==b) {
			System.out.println("a==b");
		}
		if(a==c) {
			System.out.println("a==c");
		}
		*/
		
		String a = new String("hello");
		String b = "hello";
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b))System.out.println("a equals b");
		String str1="abc";
		String str2="abc";
		// new �� ��ü�������� ������ JVM�� ������ �����(str1)�� �������
		// �����ϰ� ��.(���ͷ�) --> == ���� �񱳽� ���ٰ� ����� ����.
		if(str1==str2)System.out.println("true");
		else System.out.println("false");
		
		if(str1.equals(str2))System.out.println("true");
		else System.out.println("false");
				
	}
}
