package javaTest.java02;

class  OperatorEx16
{
	public static void main(String[] args) 
	{
		float pi = 3.141592f;//������ ��ū�Ŷ� f���ٿ��ش�
		float shortPi = (int)(pi * 1000) / 1000f;
		/*
			(pi*1000)���� 3141.592 ��������  ���׿����� int ���̹Ƿ� �Ҽ������ϰ��� �����Եȴ�. 3141�� ��´�
			3141 / 1000f ���� int �� float �� �����̹Ƿ� ū���� float �� ��ȯ�Ǿ� ������ ����ȴ�. 3.141 �� �ȴ�..
		*/
		System.out.println(shortPi);
	}
}
