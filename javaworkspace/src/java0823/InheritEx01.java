package java0823;

class Super{
	static int a =100;
	int x = 10;	
}
class Sub extends Super{ // 멤버변수 : y, x : x는 Super의 x가 복사되는 효과
	int y =20;
	//int x=10; 눈에 안보이게 복사되어 존재하고 있다.
	
}

public class InheritEx01 {

	public static void main(String[] args) {
	
		Sub s = new Sub();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.toString());
		System.out.println(s);
		//상속받으면 static 변수 (클래스 변수)도 그냥 자기꺼 처럼 바로 사용가능.
		System.out.println(Sub.a);
	}

}
