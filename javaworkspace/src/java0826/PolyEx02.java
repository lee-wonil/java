package java0826;

class AClass1{
	int x;
	void add() {
		System.out.println("AAA");
	}
	public String toString() {
		return x+"";
	}
}
class BClass1 extends AClass1{
	int y;
	void add() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
	public String toString() {
		sub();
		return x+""+y;
	}
}

public class PolyEx02 {

	public static void main(String[] args) {
		AClass1 a = new AClass1();		//�⺻��ü���� : x		
		AClass1 a1 = new BClass1();		//������ ��ü ���� : x,(y)
		// ������ ����, a�� a1�̳� �ΰ����� �Ȱ��� x�� ��밡��
		// �޸𸮻����δ� a ���·� �����ϴ� ���� ����.
		// �׷��� �̷��� ��������ü�� �����ϴ� ������ ������ �ƴ� �޼��� ������ ����Ѵ�.
		
		//a[x,add("AAA")]
		//a1[x,y,@add("BBB"),sub]
		//	 A B   A@B        B
		System.out.println(a.x);
		a.add();
		System.out.println(a1.x);
		a1.add();
		System.out.println(a1);

	}

}
