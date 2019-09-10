package java0828;

interface Test{
	//상수
	public static final int NUM=1;
	//추상메서드
	public abstract void add();
	//int A=100;		//public static final 생략	(O)
	//void sub();			//public abstract 생략	(O)
}
interface Test2 {
	int var =100;
	void sub();
}
//class A{	}
// 클래스 상속과 인터페이스 구현을 같이 작성할 수 있다.
//class Inter extends A implements Test{
class Inter implements Test,Test2{
	@Override
	public void add() {
		System.out.println("implements add()");
	}
	@Override
	public void sub() {
		System.out.println("implements sub()");
	}
}
class Git implements Test{

	@Override
	public void add() {
		System.out.println("Git!!!!");
		
	}
	
}

public class InterEx01 {
	public static void main(String[] args) {
		//인터페이스 객체 생성 불가능 (미완성)
		//Test T = new Test();		
		Inter i = new Inter();
		i.add();
		System.out.println(i.NUM);
		i.sub();
		System.out.println(i.var);
//		i.var = 300;	//final 선언이 되어 상수로 취급이 된다. 상수는 수정 불가능
		Git g = new Git();
		g.add();
		Test t = new Inter();
		t.add();
		
		Test2 t2 = new Inter();			// 부모 or 구현하는 인터페이스로 담고
		if(t2 instanceof Inter) {		// 실제 객체 타입 확인하고
			Inter in =(Inter)t2;		// 실제 객체 타입으로 형변환해서 객체타입의 레퍼런스 변수로 다시 담아
										// 모든 기능과 변수 사용.
			in.add();
		}
		//t2.add();						// 바로 사용불가. t2는 Test2 타입으로 add()의 존재를 모름.
		
	}
}
