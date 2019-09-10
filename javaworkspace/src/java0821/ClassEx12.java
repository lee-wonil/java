package java0821;
/*
 * *** 변수 ****
	클래스 기본형 변수 : 클래스명. 변수명 : static 키워드 있는 변수
	클래스 참조형 변수
	
	인스턴스 기본형 변수 : 인스턴스변수명.변수명 : 무조건 new로 객체 생성 후 사용가능.
	인스턴스 참조형 변수
	
	지역 기본형 변수 : 메서드 안에서 선언. 선언된 위치에서만 사용가능
	지역 참조형 변수
	**** 메서드 ****
	클래스 메서드 : static 붙은 메서드 : 클래스명.메서드명()
	인스턴스 메서드 : 일반 메서드        : 인스턴스 변수명.메서드명()
 */
class TvTest{
	boolean power = false;
	int ch = 0 , vol =1;
}
public class ClassEx12 {
	static int a;		//디폴트값 0
	static ClassEx12 c;	//디폴트값 null(주소가 없다)
//	static TvTest tv =null; //이런 식으로 만들지는 않는다.
	static TvTest tv = null;
	// 인스턴스 변수
	int x;//자동 초기화 : 디폴트값 0
	TvTest tv2 = new TvTest();
//	ClassEx12 c2 = new ClassEx12();//인스턴스 참조형, 메모리 무한로딩: 자신의 클래스로 변수 생성할 수 없다.
	ClassEx12 c2 = null;
	public static void main(String[] args) {
		
//		static int b = 100;//사용 불가능 
		
		//지역변수
		int b = 100;			// 지역기본형
		TvTest t = new TvTest();// 지역 참조형		
		//지역변수는 선언만 하면 값이 아예 없어서 사용불가능(자동초기화X)
		//int c ;int d = c;
		ClassEx12 c1= new ClassEx12();
		System.out.println(c1.x);
		System.out.println(ClassEx12.a);
		//System.out.println(ClassEx12.tv.ch);
		if(ClassEx12.tv!=null) { // null 값을 갖고 있는지 확인 후 실행
			System.out.println(ClassEx12.tv.ch);
		}
		else {
			ClassEx12.tv=new TvTest();
			System.out.println(ClassEx12.tv.ch);
		}
			
		//선언 위치가 다르면 이름이 같아도 괜찮다.
		int a=ClassEx12.a;
		//지역>인스턴스>클래스
		System.out.println(a);
		//Static 클래스 메서드
		Math.random();
		
		
		
		
		
		
		
		
	}
}
