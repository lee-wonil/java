package java0829;

public class Exception12 {
	public static void main(String[] args) {
		//#1.
		//add();
		
		try {
			add();
		} catch (Exception e) {
			// 예외 발생시 처리할 코드 작업
		}
		System.out.println("test");
	}
	/* #1.	정상적으로 예외 처리하는 방법
	public static void add() {
		try {
			// 예외 발생 가능
			Exception e = new Exception();
			throw e;

		}
		catch(Exception e){
			System.out.println("예외 발생");
		}

	}
	 */
	// #2.
	public static void add() throws Exception {	// 이 메서드를 호출한 곳으로 예외 처리를 떠 넘기겠다.
		Exception e= new Exception();
		throw e;//예외 강제 발생
	}


}
