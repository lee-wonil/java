package javaTest.java01;
class SpecialChar01 {
	public static void main(String[] args) 
	{
		char single = '\'';				//  single = ''';�� ���� �� �� ����.
		String dblQuote = "\"Hello\"";	//  �����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
		String root = "c:\\";

		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);

			//�̽������� ���� ���
		System.out.println("�̽������� ���� ���");
		System.out.println("1. abcdefg\bhijklmn");
		System.out.println("2. abcdefg\thijklmn");
		System.out.println("3. abcdefg\nhijklmn");
		System.out.println("4. abcdefg\fhijklmn");
		System.out.println("5. abcdefg\rhijklmn");
		System.out.println("6. abcdefg\"hijklmn");
		System.out.println("7. abcdefg\'hijklmn");
		System.out.println("8. abcdefg\\hijklmn");
	}
}