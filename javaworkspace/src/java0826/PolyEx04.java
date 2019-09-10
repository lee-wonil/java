package java0826;

class AClass3{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		return x+" ";
	}
}
class BClass3 extends AClass3{ // x,y,@add(),sub
	int y;
	@Override
	void add() {//오버라이딩 : 주체는 A꺼 그냥 내용물만 바꾼것(이것을 사용하기 위해 다형성을 사용함)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx04 {

	public static void main(String[] args) {
		AClass3 a = new AClass3();
		BClass3 b = null;
		b = (BClass3)a;// 문법적으로 맞으나 메모리가 맞지 않아서 불가능
		
		//b.add();	// B클래스 타입의 b는 B클래스가 가지고 있는 모든 멤버에 접근이 가능해야 하는데
					// 실제 객체는 A클래스로 B클래스가 가져야할 멤버가 몇개는 없는 형태여서
					// 컴파일은 되나, 실행할때 에러 ClassCastException...
		//BClass3 bb = new AClass3();	//바로 에러 : new로 바로 대입하니 메모리가 맞지 않다며 컴파일부터 에러		
		
	}

}
