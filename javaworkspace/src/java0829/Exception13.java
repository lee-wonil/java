package java0829;

public class Exception13 {
	public static void main(String[] args) {
		try {
			method();
		}
		catch(Exception e){
			System.out.println("���� �޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}

	static void method() throws Exception {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("method()���� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}
}
