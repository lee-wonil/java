package java0826;

class AClass3{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		return x+" ";
	}
}
class BClass3 extends AClass3{ // x,y,@add(),sub
	int y;
	@Override
	void add() {//�������̵� : ��ü�� A�� �׳� ���빰�� �ٲ۰�(�̰��� ����ϱ� ���� �������� �����)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx04 {

	public static void main(String[] args) {
		AClass3 a = new AClass3();
		BClass3 b = null;
		b = (BClass3)a;// ���������� ������ �޸𸮰� ���� �ʾƼ� �Ұ���
		
		//b.add();	// BŬ���� Ÿ���� b�� BŬ������ ������ �ִ� ��� ����� ������ �����ؾ� �ϴµ�
					// ���� ��ü�� AŬ������ BŬ������ �������� ����� ��� ���� ���¿���
					// �������� �ǳ�, �����Ҷ� ���� ClassCastException...
		//BClass3 bb = new AClass3();	//�ٷ� ���� : new�� �ٷ� �����ϴ� �޸𸮰� ���� �ʴٸ� �����Ϻ��� ����		
		
	}

}
