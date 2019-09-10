package java0905;
// 1. 스레드 클래스 만들기
class TimerThread extends Thread{
	int n=0;
	@Override
	//2. run()메서드 오버라이딩
	public void run() {
		while(true) {
			System.out.println(n++);
			try {
				sleep(1000);	// 1초 잠재우기
			} catch (InterruptedException e) {
				return;
			}
			if(n>100) {
				return;
			}
		}
	}
			
}
public class TreadEx01 {

	public static void main(String[] args) {	//main 스레드가 실행
		TimerThread t = new TimerThread();
		t.start();

	}

}
