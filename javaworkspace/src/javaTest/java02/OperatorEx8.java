package javaTest.java02;

class  OperatorEx8
{
	public static void main(String[] args) 
	{
		byte a = 10,b = 20;
//		byte c = a+b; //int������ ũ�Ⱑ ���� �ڷ����� int������ ��ȯ�Ŀ� ������ �����Ѵ�.
		byte c = (byte)(a+b); // �켱������ ���� () ��������Ѵ�.
		System.out.println(c);
	}
}
