package java0826;

class AClass4{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		return x+" ";
	}
}
class BClass4 extends AClass4{ // x,y,@add(),sub
	int y;
	@Override
	void add() {//�������̵� : ��ü�� A�� �׳� ���빰�� �ٲ۰�(�̰��� ����ϱ� ���� �������� �����)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx05 {

	public static void main(String[] args) {
		
		AClass4 a = null;
		BClass4 b = new BClass4();
		BClass4 b2 = null;
		
		a=(AClass4)b;		// ������ upcasting
		b2 = (BClass4)a;	// ������ downcasting �׷��� ���� �޸𸮻󿡴� BŸ�Ծȿ� BŸ�� ��ü�� ���ԵǹǷ� �� �����
		b2.add();
		a.add();
		b2.sub();
		
	}

}
