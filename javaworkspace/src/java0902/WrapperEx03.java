package java0902;

public class WrapperEx03 {

	public static void main(String[] args) {
		// 기본형 --> 문자열로 변환
		
		String s1 = Integer.toString(123);
		System.out.println(s1);
		
		String s2=Integer.toHexString(123);
		System.out.println(s2);
		
		// 타입 알아보기
		int x = 10;
		Object obj =x;
		System.out.println(obj.getClass());
		
		//////////////////////////////////////
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
