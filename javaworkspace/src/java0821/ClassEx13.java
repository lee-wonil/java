package java0821;

public class ClassEx13 {
//	#1.
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
//	#2.
	int mul(int a,int b) {
		return a*b;
	}
	double mul(int a,double b) {
		return a*b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	/*//����Ÿ���� �޶� �Ű������� ������ Ÿ���� ���� ������ ��� �Ұ�
	double sub(int a, int b) {
		return (double)a-b;
	}
	*/
	
	public static void main(String[] args) {
		//�޼��� �����ε��� �ڹ� �����Ϸ��� ���� �ǴܵǸ�
		//�����Ϸ��� �޼����̸��� �Ű������� ����/Ÿ�� ��ġ�ϴ� �޼��带 ã�Ƴ� �����Ŵ
		//�����Ϸ��� �̸��� ���� �޼������ ������ �� ������ �����ε� ����
		
		ClassEx13 cls = new ClassEx13();
		System.out.println(cls.sum(10, 20));
		System.out.println(cls.sum(10, 20,30));
		System.out.println(cls.mul(10,10));
		System.out.println(cls.mul(10, 20.5));
	}

}
