package java0820;
class Tv{
	
	//클래스 기본형 변수
	static boolean power = false;
	//인스턴스 기본형 변수
	int ch=1;
	int vol=0;
	
}

public class ClassEx04 {	
	public static void main(String[] args) {
		// 지역변수 : 메서드내에 선언된 변수 ( 선언된 블럭에서만 사용가능 )
		int a = 10;
		System.out.println(a);
		//int i;
		for(int i =0;i<5;i++) {
			System.out.println(i);
		}	
		//System.out.println(i);//for문 종료시 지역변수 i는 사용이 불가능
		System.out.println(Tv.power);// 클래스 변수는 객체 생성이 되지 않아도 사용이 가능하다. 
//		System.out.println(Tv.vol);//인스턴스 변수는 객체가 생성이 되지 않으면 사용이 불가능 하다.
		Tv t1 = new Tv();//Tv형 객체 t1생성
		System.out.println(t1.vol);//객체가 생성이 되어 인스턴스 변수 사용이 가능
	}
//	a=10//지역변수이므로 main메서드가 끝난 후에는 사용 불가

}
