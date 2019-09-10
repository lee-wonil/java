package java0820;

import java.util.Scanner;

class TvEx{
	//인스턴스 변수, 스태틱(==클래스==전역)변수
	//int y=20;
	//static int x=10;
	//static int x=y; //불가능 메모리 로딩 순서에 의해서 불가능함
	//static 먼저 메모리에 로딩 --> 객체 생성후 인스턴스가 메모리에 올라감
	static int x=100;
	int y=x;
	//static int x =100;
	// static 먼저 로딩되니 정상적인 코드이다.
	//보기 불편하니 메모리에 로딩되는 순서대로 작성하는 것이 가독성이 높다.
}

// 이것도 클래스 이므로
public class ClassEx05 {
	// 인스턴스 변수, 스테틱변수 선언 가능
	static int a=100;//스태틱변수
	int i = 20;//인스턴스 변수
//  int i;	// 선언은 가능하다.
//	i=20; // 대입연산자를 이용한 연산처리라서 메서드 안에서 해야함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TvEx.x);
		//System.out.println(TvEx.y);
		System.out.println(ClassEx05.a);
//		System.out.println(ClassEx05.i); //객체가 생성이 되지 않아 오류
		//인스턴스 변수를 사용할때는 객체 생성후 사용.
		ClassEx05 cls = new ClassEx05();
		System.out.println(cls.i);
		//1회용 객체 생성, 변수 i만 한번 사용하려고 할때, 잘 사용하지 않지만 알아두기
		System.out.println(new ClassEx05().i);
		Scanner sc = new Scanner (System.in);
		sc.close();
	}

}
