package javaTest.java02;

class  OperatorEx9
{
	public static void main(String[] args) 
	{
		byte a = 10, b = 30;
		byte c = (byte)(a*b);  //byte���� -128~127 ���� ǥ�� overflow���� ���� 44�� ������. 
		System.out.println(c);
	}
}
