package java0829;

public class Exception13 {
	public static void main(String[] args) {
		try {
			method();
		}
		catch(Exception e){
			System.out.println("메인 메서드에서 예외가 처리되었습니다.");
		}
	}

	static void method() throws Exception {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("method()에서 예외가 처리되었습니다.");
			throw e;
		}
	}
}
