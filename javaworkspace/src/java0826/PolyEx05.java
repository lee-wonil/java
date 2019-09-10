package java0826;

class AClass4{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		return x+" ";
	}
}
class BClass4 extends AClass4{ // x,y,@add(),sub
	int y;
	@Override
	void add() {//오버라이딩 : 주체는 A꺼 그냥 내용물만 바꾼것(이것을 사용하기 위해 다형성을 사용함)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx05 {

	public static void main(String[] args) {
		
		AClass4 a = null;
		BClass4 b = new BClass4();
		BClass4 b2 = null;
		
		a=(AClass4)b;		// 다형성 upcasting
		b2 = (BClass4)a;	// 다형성 downcasting 그러나 실제 메모리상에는 B타입안에 B타입 객체가 삽입되므로 잘 실행됨
		b2.add();
		a.add();
		b2.sub();
		
	}

}
