package java0827;
// 추상클래스
abstract class SuperClass{
	// 추상메서드
	abstract void add();
	abstract void add2();
	//일반 변수, 일반 메서드
	int a = 10;
	void test() {
		
	}
}
class SubClass extends SuperClass{
	@Override
	void add() {
		//기능 구현 
		System.out.println("add() override");
	}	
	@Override
	void add2() {
		//상속받은 추상메서드는 모두 구현을 해야 온전한 클래스가 된다.
		
	}
}


public class AbstrEx01 {

	public static void main(String[] args) {
//		SuperClass s = new SuperClass();
		SubClass sub = new SubClass();
		sub.add();

	}

}
