package java0829;

public class Exception10 {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
			Exception e = new Exception();
			throw e;
			//System.out.println("java");//여기서 에러
			// 위에 예외 강제 발생 시켜서 catch로 넘어가는데
			// 쓸데 없이 실행 문구가 있어서 에러
		}
		catch(Exception e) {
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
