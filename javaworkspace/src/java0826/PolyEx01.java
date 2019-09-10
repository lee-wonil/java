package java0826;

class AClass{
	int x;
	
}
class BClass extends AClass{
	int y;
}


public class PolyEx01 {

	public static void main(String[] args) {
		/*
		// 캐스팅 (형변환)
		int a = 10;		//4byte
		double d = a;	//8byte 프로모션(업캐스팅) 메모리 큰쪽으로는 자동 형변환 처리로 바로 대입가능.
		
		double dd = 5.7;
		int b=(int)dd;	//디모션(다운캐스팅) : 강제 형변환. 소수점 밑의 데이터는 날라감.
		
		int c = 10;				//조상
		double ddd = (double)c;	//자손 : int로 부터 10을 받고, 소수점은 내가 만든다.
		*/
		// 기존 객체 생성방법
		AClass a = new AClass();
		BClass b = new BClass();
		
		//다형성 : 조상의 참조변수로 자손의 객체를 생성하는 것.
		//int = double
		AClass a1 = new BClass();
		//a1.x는 가능 a1.y는 불가능
		//BClass b1 = new AClass();//에러!! 불가능. 자손이 조상으로 객체 만들기 안됨.
								   //A(x)B(x,y)B클래스의 조건을 충족시킬수 없어서 안됨.
		BClass b1 = (BClass) new AClass();		
		//b1.x와 b1.y 둘다 가능		
	}

}
