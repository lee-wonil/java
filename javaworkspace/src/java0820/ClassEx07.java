package java0820;

public class ClassEx07 {
	//����x,�Է°�x
	//����x,�Է°�o
	//1.�޼��� ����
	void hello(String name) {
		System.out.println(name+"�� ȯ���մϴ�.");
	}
	//����o,�Է°�x	
	int ten() {
		return 10;
	}
	int sum(int a,int b) {
//		int res = a+b;// ��������
//		return res;
		return a+b;
	}
	//����o,�Է°�o
	public static void main(String[] args) {
		ClassEx07 cls = new ClassEx07();
		cls.hello("ȫ�浿");
		cls.hello("��ī��");
		int result = cls.ten();
		System.out.println(result);
		result= cls.sum(10, 20);
		System.out.println(result);
		System.out.println(cls.sum(100,200));
	}

}
