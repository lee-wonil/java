package java0827;
// �߻�Ŭ����
abstract class SuperClass{
	// �߻�޼���
	abstract void add();
	abstract void add2();
	//�Ϲ� ����, �Ϲ� �޼���
	int a = 10;
	void test() {
		
	}
}
class SubClass extends SuperClass{
	@Override
	void add() {
		//��� ���� 
		System.out.println("add() override");
	}	
	@Override
	void add2() {
		//��ӹ��� �߻�޼���� ��� ������ �ؾ� ������ Ŭ������ �ȴ�.
		
	}
}


public class AbstrEx01 {

	public static void main(String[] args) {
//		SuperClass s = new SuperClass();
		SubClass sub = new SubClass();
		sub.add();

	}

}
