package java0829;

public class Exception02 {
	public static void main(String[] args) {
		try {
		//java.lang.ArrayIndexOutOfBoundsException 발생	
		System.out.println(args[0]);
		System.out.println(args[1]);
		}
		catch(Exception e) {
			System.out.println("인수를 입력하세요");
			System.out.println(e);
		}
	}
}
