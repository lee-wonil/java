package javaTest.java01;
public class CastingTest06 {
	public static void main(String[] args) {	
		int intValue = 44032;
		char charValue = (char) intValue; //�ٿ�ĳ����
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; //�ٿ�ĳ����
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //�ٿ�ĳ����
		System.out.println(intValue);	
	}
}
