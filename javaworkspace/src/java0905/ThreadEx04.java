package java0905;

public class ThreadEx04 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for(int i = 0;i<300;i++) {
			System.out.println("-");			
		}
		System.out.println("�ҿ�ð� 1 : "+(System.currentTimeMillis()-startTime));
		for(int i = 0;i<300;i++) {
			System.out.println("|");			
		}
		System.out.println("�ҿ�ð� 2 : "+(System.currentTimeMillis()-startTime));
		
	}

}
