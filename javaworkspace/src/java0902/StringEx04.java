package java0902;

public class StringEx04 {
	public static void main(String[] args) {
		int value = 100;
		String strVal = String.valueOf(value);		//int를 String으로 형변환
		System.out.println(strVal);
		
		int value2 = 200;
		String strVal2 = value2+"";
		System.out.println(strVal2);
	}
}
