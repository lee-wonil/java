package java0820;

public class ClassEx07 {
	//리턴x,입력값x
	//리턴x,입력값o
	//1.메서드 정의
	void hello(String name) {
		System.out.println(name+"님 환영합니다.");
	}
	//리턴o,입력값x	
	int ten() {
		return 10;
	}
	int sum(int a,int b) {
//		int res = a+b;// 지역변수
//		return res;
		return a+b;
	}
	//리턴o,입력값o
	public static void main(String[] args) {
		ClassEx07 cls = new ClassEx07();
		cls.hello("홍길동");
		cls.hello("피카츄");
		int result = cls.ten();
		System.out.println(result);
		result= cls.sum(10, 20);
		System.out.println(result);
		System.out.println(cls.sum(100,200));
	}

}
