package javaTest.java01;
public class CastingTest05_Promotion {
	public static void main(String[] args) {	
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // 업캐스팅
		System.out.println(longValue);		
		
		intValue = 200;
		double doubleValue = intValue; //업캐스팅
		System.out.println(doubleValue);		
	} 
}
