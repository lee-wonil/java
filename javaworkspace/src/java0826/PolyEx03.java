package java0826;

class AClass2{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		add();
		return x+" ";
	}
}
class BClass2 extends AClass2{ // x,y,@add(),sub
	int y;
	void add() {//�������̵� : ��ü�� A�� �׳� ���빰�� �ٲ۰�(�̰��� ����ϱ� ���� �������� �����)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx03 {

	public static void main(String[] args) {
		
		AClass2 a = null;
		BClass2 b = new BClass2();
		a=(AClass2)b;	// AClass2 b = new BClass2();
		a = b;	// ����ȯ �����ص� ���������� ���������� ����ȯ ǥ�ø� ������
		a.add();// a�� Ÿ���� AClass2 Ÿ���̶� add()�޼ҵ带 ȣ���� �� ������,
				// �Ӿ˸��̴� BClass2 Ÿ���� ��ü�̹Ƿ� BClass2Ÿ�Կ� �������̵��� add()�޼��尡 ȣ��ȴ�.
		System.out.println(a);
		//a.sub(); // ���Ұ� ! a�� Ÿ���� AClass2 Ÿ������ AClass�� �����ϴ� x,add()�޼��常 ���δ�.
		
		// Object�� ��� Ŭ������ �������� ��� Ŭ���� ��ü�� ���� �� �ִ�.
		// �׷��� ��� ��ü�� ����� �ٷ� ��� �Ұ�.(� ����� �ִ��� �𸣱� ������)
		Object obj = new AClass2();
		System.out.println(obj.toString());
		Object obj2 = new BClass2();
	}

}
