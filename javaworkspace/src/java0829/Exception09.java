package java0829;

public class Exception09 {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
			Exception e = new Exception();
			throw e;
			//System.out.println("java");//���⼭ ����
			// ���� ���� ���� �߻� ���Ѽ� catch�� �Ѿ�µ�
			// ���� ���� ���� ������ �־ ����
		}
		catch(Exception e) {
			System.out.println("error");

		}
	}
}
