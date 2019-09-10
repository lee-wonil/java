package javaTest.java01;
public class CastingTest06 {
	public static void main(String[] args) {	
		int intValue = 44032;
		char charValue = (char) intValue; //다운캐스팅
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; //다운캐스팅
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //다운캐스팅
		System.out.println(intValue);	
	}
}
