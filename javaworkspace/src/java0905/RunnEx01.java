package java0905;
// #1. Runnable 인터페이스로 스레드 클래스 만들기
class TimeRunnable implements Runnable{
	int n = 0;
	
	@Override
	public void run() {	
		while(true) {
			System.out.println(n++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			if(n>100)return;
			
		}
	}
	
}

public class RunnEx01 {
	public static void main(String[] args) {
		Thread tr = new Thread(new TimeRunnable());
		tr.start();
	}
}
