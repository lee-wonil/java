package javaTest.java07;
class StringEx6 
{
	public static void main(String[] args) 
	{
		int value = 100;
		String strvalue = String.valueOf(value);	//int �� String  �� ����ȯ

		int value2 = 100;
		String strvalue2 = value2 + "";		//����ȯ�� �Ǵٸ� ���...

		System.out.println(value);
		System.out.println(value2);
	}
}
