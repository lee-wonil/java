package java0828;

interface Test{
	//���
	public static final int NUM=1;
	//�߻�޼���
	public abstract void add();
	//int A=100;		//public static final ����	(O)
	//void sub();			//public abstract ����	(O)
}
interface Test2 {
	int var =100;
	void sub();
}
//class A{	}
// Ŭ���� ��Ӱ� �������̽� ������ ���� �ۼ��� �� �ִ�.
//class Inter extends A implements Test{
class Inter implements Test,Test2{
	@Override
	public void add() {
		System.out.println("implements add()");
	}
	@Override
	public void sub() {
		System.out.println("implements sub()");
	}
}
class Git implements Test{

	@Override
	public void add() {
		System.out.println("Git!!!!");
		
	}
	
}

public class InterEx01 {
	public static void main(String[] args) {
		//�������̽� ��ü ���� �Ұ��� (�̿ϼ�)
		//Test T = new Test();		
		Inter i = new Inter();
		i.add();
		System.out.println(i.NUM);
		i.sub();
		System.out.println(i.var);
//		i.var = 300;	//final ������ �Ǿ� ����� ����� �ȴ�. ����� ���� �Ұ���
		Git g = new Git();
		g.add();
		Test t = new Inter();
		t.add();
		
		Test2 t2 = new Inter();			// �θ� or �����ϴ� �������̽��� ���
		if(t2 instanceof Inter) {		// ���� ��ü Ÿ�� Ȯ���ϰ�
			Inter in =(Inter)t2;		// ���� ��ü Ÿ������ ����ȯ�ؼ� ��üŸ���� ���۷��� ������ �ٽ� ���
										// ��� ��ɰ� ���� ���.
			in.add();
		}
		//t2.add();						// �ٷ� ���Ұ�. t2�� Test2 Ÿ������ add()�� ���縦 ��.
		
	}
}
