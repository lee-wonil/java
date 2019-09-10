package java0826;

class AClass1{
	int x;
	void add() {
		System.out.println("AAA");
	}
	public String toString() {
		return x+"";
	}
}
class BClass1 extends AClass1{
	int y;
	void add() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("SUBSUB");
	}
	public String toString() {
		sub();
		return x+""+y;
	}
}

public class PolyEx02 {

	public static void main(String[] args) {
		AClass1 a = new AClass1();		//기본객체생성 : x		
		AClass1 a1 = new BClass1();		//다형성 객체 생성 : x,(y)
		// 변수만 보면, a나 a1이나 두가지는 똑같이 x만 사용가능
		// 메모리상으로는 a 형태로 생성하는 것이 좋다.
		// 그런데 이렇게 다형성객체로 생성하는 이유는 변수가 아닌 메서드 때문에 사용한다.
		
		//a[x,add("AAA")]
		//a1[x,y,@add("BBB"),sub]
		//	 A B   A@B        B
		System.out.println(a.x);
		a.add();
		System.out.println(a1.x);
		a1.add();
		System.out.println(a1);

	}

}
