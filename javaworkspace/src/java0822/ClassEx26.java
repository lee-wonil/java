package java0822;
//default Ŭ���� : ���������� ����
class Sample{
	//��ü����
	public int a=10;
	int b=20;
	private int c = 30;
	void show() {
		System.out.println(c);
	}
}
//public Ŭ���� : ��ü����, ��� ���� ����
public class ClassEx26 {
	//public �޼��� : ��ü����, ��� ���� ����
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.a);//public �ٸ� Ŭ����
		System.out.println(s.b);//default
		//System.out.println(s.c);//�Ұ���
		s.show();
		s.a=100;
		s.b=200;
		
	}
}
