package javaTest.java01;
public class CastingTest05_Promotion {
	public static void main(String[] args) {	
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // ��ĳ����
		System.out.println(longValue);		
		
		intValue = 200;
		double doubleValue = intValue; //��ĳ����
		System.out.println(doubleValue);		
	} 
}
