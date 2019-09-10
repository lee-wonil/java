package java0905;

class ThEx extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			System.out.println("run");
		}
	}
	// 단점 : 무한반복시 종료조건을 적지 않은 경우에는 완전히 종료 불가
}

public class ThreadEx02 {
	public static void main(String[] args) {
		ThEx th1 = new ThEx();
		ThEx th2 = new ThEx();
		th1.start();
		th2.start();
		//th.start();
		//th.run();	// 단순 메서드 호출 : run()을 다 실행한 후에 아래 반복문 실행 : 싱글스레드
		for(int i = 0;i<100;i++) {
			System.out.println("main");
		}
		System.out.println("종료");
	}
}
