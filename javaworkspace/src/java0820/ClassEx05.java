package java0820;

import java.util.Scanner;

class TvEx{
	//�ν��Ͻ� ����, ����ƽ(==Ŭ����==����)����
	//int y=20;
	//static int x=10;
	//static int x=y; //�Ұ��� �޸� �ε� ������ ���ؼ� �Ұ�����
	//static ���� �޸𸮿� �ε� --> ��ü ������ �ν��Ͻ��� �޸𸮿� �ö�
	static int x=100;
	int y=x;
	//static int x =100;
	// static ���� �ε��Ǵ� �������� �ڵ��̴�.
	//���� �����ϴ� �޸𸮿� �ε��Ǵ� ������� �ۼ��ϴ� ���� �������� ����.
}

// �̰͵� Ŭ���� �̹Ƿ�
public class ClassEx05 {
	// �ν��Ͻ� ����, ����ƽ���� ���� ����
	static int a=100;//����ƽ����
	int i = 20;//�ν��Ͻ� ����
//  int i;	// ������ �����ϴ�.
//	i=20; // ���Կ����ڸ� �̿��� ����ó���� �޼��� �ȿ��� �ؾ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TvEx.x);
		//System.out.println(TvEx.y);
		System.out.println(ClassEx05.a);
//		System.out.println(ClassEx05.i); //��ü�� ������ ���� �ʾ� ����
		//�ν��Ͻ� ������ ����Ҷ��� ��ü ������ ���.
		ClassEx05 cls = new ClassEx05();
		System.out.println(cls.i);
		//1ȸ�� ��ü ����, ���� i�� �ѹ� ����Ϸ��� �Ҷ�, �� ������� ������ �˾Ƶα�
		System.out.println(new ClassEx05().i);
		Scanner sc = new Scanner (System.in);
		sc.close();
	}

}
