package java0826;

class Super1{
	void add() {
		System.out.println("super");
	}
}
class Sub1 extends Super1{
	//�������̵� : �θ��� �޼��� ������ ������ �ȵ�� ���� ������ �������Ѱ�
	@Override// ������̼�(annotataion)	
	void add() {
		System.out.println("sub");
	}
}

public class InheriEx06 {

	public static void main(String[] args) {
		Sub1 sub = new Sub1();
		sub.add();
		Super1 sup= new Super1();
		sup.add();
	}

}
