package java0829;

public class Exception05 {
	public static void main(String[] args) {
		String [] stringNumer= {"23","12","3.141592","999"};
		int i =0;
		try {
			for(i=0;i<stringNumer.length;i++) {
				//java.lang.NumberFormatException �Ǽ����ڤ���-> ���� ��ȯ�Ҷ� �߻�
				int j = Integer.parseInt(stringNumer[i]); 
				System.out.println("������ ��ȯ�� ���� " +j);
			}
		}catch(Exception e) {	//���� �߻��� �� �̻� �ݺ����� �������� �ʴ´�.
			System.out.println(stringNumer[i]+"�� ������ ��ȯ �Ҽ� �����ϴ�.");
		}//try ���� �����Ҷ� ����.

	}
}
