package javaTest.java02;

class  OperatorEx11
{
	public static void main(String[] args) 
	{
		long a = 1000000 * 1000000; 
		//����Ʈ ���� int �̹Ƿ� int �� int �� �����̱� ������ int������� ��µȴ�.
		long b = 1000000 * 1000000L;
		//int �� long �� �����̹Ƿ� ����� long ���̴�...����Ʈ��(int) �ƴѰ�� ���̻縦 �ٿ����Ѵ�..
		System.out.println(a);
		System.out.println(b);
	}
}
