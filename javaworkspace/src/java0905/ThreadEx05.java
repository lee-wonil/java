package java0905;

class ThEx03 extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<300;i++) {
			System.out.println("|");			
		}
		System.out.println("�ҿ�ð� 2 : "+(System.currentTimeMillis()-ThreadEx05.startTime));
	}
}

public class ThreadEx05 {
	
	// �ٸ� Ŭ������ ������ �������� static ������ ��ȯ
	static long startTime = 0;
	public static void main(String[] args) {
		// ���ν����忡�� ���۽ð� ����
		startTime = System.currentTimeMillis();
		// ������ ��ü ����, ��ŸƮ
		ThEx03 th = new ThEx03();
		th.start();
		for(int i = 0;i<300;i++) {
			System.out.println("-");			
		}
		System.out.println("�ҿ�ð� 1 : "+(System.currentTimeMillis()-startTime));
		
		
	}

}
