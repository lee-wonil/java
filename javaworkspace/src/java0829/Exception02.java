package java0829;

public class Exception02 {
	public static void main(String[] args) {
		try {
		//java.lang.ArrayIndexOutOfBoundsException �߻�	
		System.out.println(args[0]);
		System.out.println(args[1]);
		}
		catch(Exception e) {
			System.out.println("�μ��� �Է��ϼ���");
			System.out.println(e);
		}
	}
}
