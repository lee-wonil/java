package java0829;

public class Exception07 {
	public static void main(String[] args) {
		try {
			// 개발자가 에러 났다고 직접 알려주는 형태
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("Exception 발생 !!!");
		}
	}
}
