package java0821;

public class ClassEx14 {
	
	//#1
	//Ŭ���� ����
	static int x=10;
	//Ŭ���� ��
	static {
		System.out.println("Ŭ���� �ʱ�ȭ ��");
		x=100;
	}
	//�ν��Ͻ� �� : ��ü ������ ����
	{
		System.out.println("�ν��Ͻ���");
		
		
		
	}
	//������
	ClassEx14(){
		System.out.println("������");
	}
	public static void main(String[] args) {
		ClassEx14 cls = new ClassEx14();
		ClassEx14 cls2 = new ClassEx14();
		
		
	}
}
