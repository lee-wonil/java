package java0902;


public class WrapperEx01 {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Double d = new Double(3.14);
		Boolean b= new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);
		
		// Character 를 제외한 나머지 Wrapper 클래스의 경우
		// 문자열로 Wrapper 객체를 생성할 수 있다.
		
		//Float 객체는 double 타입의 값으로 생성 가능
		Float f = new Float((double)3.14);
	}
}
