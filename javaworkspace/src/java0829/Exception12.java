package java0829;

public class Exception12 {
	public static void main(String[] args) {
		//#1.
		//add();
		
		try {
			add();
		} catch (Exception e) {
			// ���� �߻��� ó���� �ڵ� �۾�
		}
		System.out.println("test");
	}
	/* #1.	���������� ���� ó���ϴ� ���
	public static void add() {
		try {
			// ���� �߻� ����
			Exception e = new Exception();
			throw e;

		}
		catch(Exception e){
			System.out.println("���� �߻�");
		}

	}
	 */
	// #2.
	public static void add() throws Exception {	// �� �޼��带 ȣ���� ������ ���� ó���� �� �ѱ�ڴ�.
		Exception e= new Exception();
		throw e;//���� ���� �߻�
	}


}
