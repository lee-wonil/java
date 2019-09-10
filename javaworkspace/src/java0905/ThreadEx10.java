package java0905;

class TimerThr extends Thread{
	private int n = 0;
	private boolean flag = false;
	public void run() {
		while(true) {
			System.out.println(n++);
			try {
				sleep(1000);		//TimerTh 스레드 sleep() 걸기
				if(flag) return;
			}catch(Exception e) {
				return;	
			}
		}
	}
	public void finish() {
		flag = true;
	}
}

public class ThreadEx10 {
	public static void main(String[] args) {
		TimerThr th = new TimerThr();
		th.start();
		try {
			Thread.sleep(5000);// main 스레드 sleep()걸기
		}
		catch(Exception e) {
		}
		th.finish();
		long id =Thread.currentThread().getId();
		Thread.State ts =Thread.currentThread().getState();// thread 상태 체크
		System.out.println(ts);
	}
}
