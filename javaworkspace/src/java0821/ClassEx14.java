package java0821;

public class ClassEx14 {
	
	//#1
	//클래스 변수
	static int x=10;
	//클래스 블럭
	static {
		System.out.println("클래스 초기화 블럭");
		x=100;
	}
	//인스턴스 블럭 : 객체 생성시 실행
	{
		System.out.println("인스턴스블럭");
		
		
		
	}
	//생성자
	ClassEx14(){
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		ClassEx14 cls = new ClassEx14();
		ClassEx14 cls2 = new ClassEx14();
		
		
	}
}
