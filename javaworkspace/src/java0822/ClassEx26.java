package java0822;
//default 클래스 : 접근지정자 생략
class Sample{
	//전체공개
	public int a=10;
	int b=20;
	private int c = 30;
	void show() {
		System.out.println(c);
	}
}
//public 클래스 : 전체공개, 모두 접근 가능
public class ClassEx26 {
	//public 메서드 : 전체공개, 모두 접근 가능
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.a);//public 다른 클래스
		System.out.println(s.b);//default
		//System.out.println(s.c);//불가능
		s.show();
		s.a=100;
		s.b=200;
		
	}
}
