package java0905;

class ThEx03 extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<300;i++) {
			System.out.println("|");			
		}
		System.out.println("소요시간 2 : "+(System.currentTimeMillis()-ThreadEx05.startTime));
	}
}

public class ThreadEx05 {
	
	// 다른 클래스와 공유할 목적으로 static 변수로 변환
	static long startTime = 0;
	public static void main(String[] args) {
		// 메인스레드에서 시작시간 대입
		startTime = System.currentTimeMillis();
		// 스레드 객체 생성, 스타트
		ThEx03 th = new ThEx03();
		th.start();
		for(int i = 0;i<300;i++) {
			System.out.println("-");			
		}
		System.out.println("소요시간 1 : "+(System.currentTimeMillis()-startTime));
		
		
	}

}
