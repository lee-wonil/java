package java0826;

class AClass2{// x, add
	int x;
	void add() {
		System.out.println("AAA");
	}
	@Override
	public String toString() {
		add();
		return x+" ";
	}
}
class BClass2 extends AClass2{ // x,y,@add(),sub
	int y;
	void add() {//오버라이딩 : 주체는 A꺼 그냥 내용물만 바꾼것(이것을 사용하기 위해 다형성을 사용함)
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
}

public class PolyEx03 {

	public static void main(String[] args) {
		
		AClass2 a = null;
		BClass2 b = new BClass2();
		a=(AClass2)b;	// AClass2 b = new BClass2();
		a = b;	// 형변환 생략해도 가능하지만 습관적으로 형변환 표시를 해주자
		a.add();// a의 타입이 AClass2 타입이라 add()메소드를 호출할 수 있으나,
				// 속알맹이는 BClass2 타입의 객체이므로 BClass2타입에 오버라이딩된 add()메서드가 호출된다.
		System.out.println(a);
		//a.sub(); // 사용불가 ! a의 타입이 AClass2 타입으로 AClass에 존재하는 x,add()메서드만 보인다.
		
		// Object는 모든 클래스의 조상으로 어떠한 클래스 객체도 담을 수 있다.
		// 그러나 담긴 객체의 기능은 바로 사용 불가.(어떤 기능이 있는지 모르기 때문에)
		Object obj = new AClass2();
		System.out.println(obj.toString());
		Object obj2 = new BClass2();
	}

}
