package java0821;
/*
 * *** ���� ****
	Ŭ���� �⺻�� ���� : Ŭ������. ������ : static Ű���� �ִ� ����
	Ŭ���� ������ ����
	
	�ν��Ͻ� �⺻�� ���� : �ν��Ͻ�������.������ : ������ new�� ��ü ���� �� ��밡��.
	�ν��Ͻ� ������ ����
	
	���� �⺻�� ���� : �޼��� �ȿ��� ����. ����� ��ġ������ ��밡��
	���� ������ ����
	**** �޼��� ****
	Ŭ���� �޼��� : static ���� �޼��� : Ŭ������.�޼����()
	�ν��Ͻ� �޼��� : �Ϲ� �޼���        : �ν��Ͻ� ������.�޼����()
 */
class TvTest{
	boolean power = false;
	int ch = 0 , vol =1;
}
public class ClassEx12 {
	static int a;		//����Ʈ�� 0
	static ClassEx12 c;	//����Ʈ�� null(�ּҰ� ����)
//	static TvTest tv =null; //�̷� ������ �������� �ʴ´�.
	static TvTest tv = null;
	// �ν��Ͻ� ����
	int x;//�ڵ� �ʱ�ȭ : ����Ʈ�� 0
	TvTest tv2 = new TvTest();
//	ClassEx12 c2 = new ClassEx12();//�ν��Ͻ� ������, �޸� ���ѷε�: �ڽ��� Ŭ������ ���� ������ �� ����.
	ClassEx12 c2 = null;
	public static void main(String[] args) {
		
//		static int b = 100;//��� �Ұ��� 
		
		//��������
		int b = 100;			// �����⺻��
		TvTest t = new TvTest();// ���� ������		
		//���������� ���� �ϸ� ���� �ƿ� ��� ���Ұ���(�ڵ��ʱ�ȭX)
		//int c ;int d = c;
		ClassEx12 c1= new ClassEx12();
		System.out.println(c1.x);
		System.out.println(ClassEx12.a);
		//System.out.println(ClassEx12.tv.ch);
		if(ClassEx12.tv!=null) { // null ���� ���� �ִ��� Ȯ�� �� ����
			System.out.println(ClassEx12.tv.ch);
		}
		else {
			ClassEx12.tv=new TvTest();
			System.out.println(ClassEx12.tv.ch);
		}
			
		//���� ��ġ�� �ٸ��� �̸��� ���Ƶ� ������.
		int a=ClassEx12.a;
		//����>�ν��Ͻ�>Ŭ����
		System.out.println(a);
		//Static Ŭ���� �޼���
		Math.random();
		
		
		
		
		
		
		
		
	}
}
