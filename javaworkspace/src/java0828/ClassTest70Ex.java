package java0828;

import java.util.Scanner;

// 추상 클래스 
/*
	아래와 같이 3개의 필드와 메소드를 가진 4개의 클래스 Add,Sub,Mul,Div 를 작성하세요. 
	- int타입의 a, b 필드 : 2개의 피연산자 저장할 변수
	- void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
	- int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
	그런데, 각각의 클래스마다 공통된 필드와 메소드가 존재하는 구조이므로, 
	Calc라는 이름의 추상클래스를 작성하여 Calc를 상속받아 각 4개의 클래스를 작성해보세요.
	그리고, main()메소드에서 실행예시와 같이 2개의 정수와 연산자를 입력받은 후,
	4개의 클래스중 적합한 연산을 처리할 수 있는 객체를 생성하고 메서드 호출하여 그 결과 값을 화면에 출력하게 작성 해보세요. 
	실행 예시 :
		두 정수와 연산자를 입력하세요 >> 5 7 +
		12
*/
abstract class Calc{
	protected int a, b;
	void setValue(int a,int b) {	// 추상메소드로 만들 필요 없어 보여서 그냥 선언
		this.a=a;
		this.b=b;
	}
	abstract protected int calculate();	//추상메소드
}
class Add extends Calc{	
	@Override
	protected int calculate() {
		return a+b;
	}	
}
class Sub extends Calc{
	@Override
	protected int calculate() {
		return a-b;
	}	
}
class Mul extends Calc{
	@Override
	protected int calculate() {
		return a*b;
	}	
}
class Div extends Calc{
	@Override
	protected int calculate() {
		return a/b;
	}	
}
public class ClassTest70Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cal;	// 다형성 사용을 위해서 calc 사용
		System.out.println("두 정수와 연산자를 입력하세요 >>");
		String str = sc.nextLine();
		String []strs = str.split(" "); // 공백 기준으로 문자열을 쪼갠다.
			
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		
		char c = strs[2].charAt(0);
		if(c=='+') {
			cal=new Add();		// 다형성
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='-') {
			cal=new Sub();		// 다형성
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='*') {
			cal=new Mul();		// 다형성
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='/') {
			cal=new Div();		// 다형성
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else {
			System.out.println("잘 못 입력 하셨습니다.");
		}
		sc.close();
	}
}
