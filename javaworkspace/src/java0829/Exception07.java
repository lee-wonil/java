package java0829;

public class Exception07 {
	public static void main(String[] args) {
		try {
			// �����ڰ� ���� ���ٰ� ���� �˷��ִ� ����
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("Exception �߻� !!!");
		}
	}
}
