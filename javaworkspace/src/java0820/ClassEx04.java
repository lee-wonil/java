package java0820;
class Tv{
	
	//Ŭ���� �⺻�� ����
	static boolean power = false;
	//�ν��Ͻ� �⺻�� ����
	int ch=1;
	int vol=0;
	
}

public class ClassEx04 {	
	public static void main(String[] args) {
		// �������� : �޼��峻�� ����� ���� ( ����� �������� ��밡�� )
		int a = 10;
		System.out.println(a);
		//int i;
		for(int i =0;i<5;i++) {
			System.out.println(i);
		}	
		//System.out.println(i);//for�� ����� �������� i�� ����� �Ұ���
		System.out.println(Tv.power);// Ŭ���� ������ ��ü ������ ���� �ʾƵ� ����� �����ϴ�. 
//		System.out.println(Tv.vol);//�ν��Ͻ� ������ ��ü�� ������ ���� ������ ����� �Ұ��� �ϴ�.
		Tv t1 = new Tv();//Tv�� ��ü t1����
		System.out.println(t1.vol);//��ü�� ������ �Ǿ� �ν��Ͻ� ���� ����� ����
	}
//	a=10//���������̹Ƿ� main�޼��尡 ���� �Ŀ��� ��� �Ұ�

}
