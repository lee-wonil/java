package java0823;

class Super{
	static int a =100;
	int x = 10;	
}
class Sub extends Super{ // ������� : y, x : x�� Super�� x�� ����Ǵ� ȿ��
	int y =20;
	//int x=10; ���� �Ⱥ��̰� ����Ǿ� �����ϰ� �ִ�.
	
}

public class InheritEx01 {

	public static void main(String[] args) {
	
		Sub s = new Sub();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.toString());
		System.out.println(s);
		//��ӹ����� static ���� (Ŭ���� ����)�� �׳� �ڱⲨ ó�� �ٷ� ��밡��.
		System.out.println(Sub.a);
	}

}
