package java0826;

class AClass{
	int x;
	
}
class BClass extends AClass{
	int y;
}


public class PolyEx01 {

	public static void main(String[] args) {
		/*
		// ĳ���� (����ȯ)
		int a = 10;		//4byte
		double d = a;	//8byte ���θ��(��ĳ����) �޸� ū�����δ� �ڵ� ����ȯ ó���� �ٷ� ���԰���.
		
		double dd = 5.7;
		int b=(int)dd;	//����(�ٿ�ĳ����) : ���� ����ȯ. �Ҽ��� ���� �����ʹ� ����.
		
		int c = 10;				//����
		double ddd = (double)c;	//�ڼ� : int�� ���� 10�� �ް�, �Ҽ����� ���� �����.
		*/
		// ���� ��ü �������
		AClass a = new AClass();
		BClass b = new BClass();
		
		//������ : ������ ���������� �ڼ��� ��ü�� �����ϴ� ��.
		//int = double
		AClass a1 = new BClass();
		//a1.x�� ���� a1.y�� �Ұ���
		//BClass b1 = new AClass();//����!! �Ұ���. �ڼ��� �������� ��ü ����� �ȵ�.
								   //A(x)B(x,y)BŬ������ ������ ������ų�� ��� �ȵ�.
		BClass b1 = (BClass) new AClass();		
		//b1.x�� b1.y �Ѵ� ����		
	}

}
