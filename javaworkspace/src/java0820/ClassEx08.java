package java0820;
//계산기 클래스 만들기 : 파라미터, 리턴값 있는 형태로
//덧셈 sum(),뺄셈 sub(), 곱셈 mul(), 나눗셈 div()
//#1. 클래스(설계도)만들기
class Calculator{
	//인스턴스 메서드
	int sum(int a,int b) {//덧셈
		return a+b;
	}
	int sub(int a,int b) {//뺄셈
		return a-b;
	}
	int mul(int a,int b) {//곱셈
		return a*b;
	}
	double div(int a,int b) {//나눗셈
		if(b==0) {// 0으로 나누는 경우에는 에러가 발생하므로 예외 처리로 0을 출력하게 한다.
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		else {
			return (double)a/b;
		}
	}
}



public class ClassEx08 {

	public static void main(String[] args) {
		int a =90,b=0;
		Calculator cal = new Calculator();
		System.out.println(cal.sum(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println(cal.div(a, b));

	}

}
