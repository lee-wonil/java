package java0829;

public class Exception06 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			//System.out.println(0/0);	//���ܹ߻� �����ڵ�
			
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}finally {
			System.out.println(5);
		}	
		System.out.println(6);
	}
}
