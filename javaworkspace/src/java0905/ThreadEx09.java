package java0905;

class TimerTh extends Thread{
	private int n = 0;
	public void run() {
		while(true) {
			System.out.println(n++);
			try {
				sleep(1000);		//TimerTh 스레드 sleep() 걸기
			}catch(Exception e) {
				return;	
			}
		}
	}
}

public class ThreadEx09 {
	public static void main(String[] args) {
		TimerTh th = new TimerTh();
		th.start();
		try {
			Thread.sleep(5000);// main 스레드 sleep()걸기
		}
		catch(Exception e) {
			
		}
		th.interrupt();
	}
}
