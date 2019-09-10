package java0905;
class ThEx02 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
		System.out.println("ThEx02종료");
	}
}

class ThEx01 implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("ThEx01 종료");		
	}	
}
public class RunnEx02 {

	public static void main(String[] args) {
		ThEx02 th1 = new ThEx02();
		Thread th2 = new Thread(new ThEx01());
		th1.start();
		th2.start();
		System.out.println("메인 종료");

	}

}
