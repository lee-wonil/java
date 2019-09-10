package java0905;
class MyThread extends Thread{
	@Override
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadEx03 {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		//my.start();	//멀티스레드 : main stack 출력 X,run()위에 쌓임
		//my.run();		//싱글스레드 : 콘솔에 main stack 출력
		System.out.println("종료");
	}
}
