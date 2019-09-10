package java0822;
/*
  	Static 멤버:
  		클래스 멤버 (클래스 변수, 클래스 메서드) 만들때 사용되는 키워드
  		공용으로 사용하고 싶을때 붙혀주는 키워드.
  		접근방법 : 클래스명.변수명/ 클래스명.메서드명()
  		
  		static 메서드는 객체 생성없이 바로 이용할 수 있다.
  		--->static 메서드는 static 멤버만 접근할수 있다.
  		--->static 메서드는 this를 사용할수 없다.
 */
class Calc{
	// 접근지정자 X == default, static == 클래스 메서드(공용메서드) -> 객체 생성없이 사용
	public static int sum(int a,int b) { return a + b ;}
	public static int mul(int a,int b) { return a * b ;}
	public static int abs(int a) { return a>0?a:-a  ;} //절대값 구하기
	void showDefault() {
		System.out.println("default 메서드");
	}
	static void showStaticDefault() {
		//showDefault(); //static은 instance에 접근 불가능	.객체 생성후에 인스턴스 사용가능	
		System.out.println(sum(10,20));//static은 static에 접근가능
	}
}

public class ClassEx30 {
	public static void main(String[] args) {
		System.out.println(Calc.sum(10, 20));
		System.out.println(Calc.mul(10, 20));
		System.out.println(Calc.abs(-20));
	}

}
