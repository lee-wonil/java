package java0820;
//���� Ŭ���� ����� : �Ķ����, ���ϰ� �ִ� ���·�
//���� sum(),���� sub(), ���� mul(), ������ div()
//#1. Ŭ����(���赵)�����
class Calculator{
	//�ν��Ͻ� �޼���
	int sum(int a,int b) {//����
		return a+b;
	}
	int sub(int a,int b) {//����
		return a-b;
	}
	int mul(int a,int b) {//����
		return a*b;
	}
	double div(int a,int b) {//������
		if(b==0) {// 0���� ������ ��쿡�� ������ �߻��ϹǷ� ���� ó���� 0�� ����ϰ� �Ѵ�.
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
		else {
			return (double)a/b;
		}
	}
}



public class ClassEx08 {

	public static void main(String[] args) {
		int a =90,b=0;
		Calculator cal = new Calculator();
		System.out.println(cal.sum(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println(cal.div(a, b));

	}

}
