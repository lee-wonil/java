package editplus;

class Test03 {
	public static void main(String[] args){
		//코드 작성
		char ch ='\u0041';
		System.out.println(ch);//출력문
		//첫글자가 대문자로 시작하면 클래스다.
		//소문자 뒤에() 소괄호가 붙어있으면 메소드다.

		long l = 100L;
		System.out.println(l);

		float f = 3.14f;
		System.out.println(f);

		//오버플로우
		byte b= (byte)200;
		System.out.println(b);

		//int : 10진수 / 8진수 : 0으로 시작하는수 / 16진수 : 0x로 시작하는 수 / 2진수 : 0b로 시작하는 수
		int i=15;
		int j =015;
		int k = 0x15;
		int m = 0b01010;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);

		String str = "안녕하세요";
		System.out.println(str);
		String name = "이원일";
		System.out.println(name);
		//String s = 'A'; 문자열의 경우 ""로 묶어야 된다.
		String s= "A";
		System.out.println(s);

	}//main
}//class
