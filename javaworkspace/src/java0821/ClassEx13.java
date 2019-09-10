package java0821;

public class ClassEx13 {
//	#1.
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
//	#2.
	int mul(int a,int b) {
		return a*b;
	}
	double mul(int a,double b) {
		return a*b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	/*//리턴타입이 달라도 매개변수의 갯수와 타입이 값이 같으면 사용 불가
	double sub(int a, int b) {
		return (double)a-b;
	}
	*/
	
	public static void main(String[] args) {
		//메서드 오버로딩은 자바 컴파일러에 의해 판단되며
		//컴파일러가 메서드이름과 매개변수의 개수/타입 일치하는 메서드를 찾아내 실행시킴
		//컴파일러가 이름이 같은 메서드들을 구분할 수 있으면 오버로딩 성공
		
		ClassEx13 cls = new ClassEx13();
		System.out.println(cls.sum(10, 20));
		System.out.println(cls.sum(10, 20,30));
		System.out.println(cls.mul(10,10));
		System.out.println(cls.mul(10, 20.5));
	}

}
