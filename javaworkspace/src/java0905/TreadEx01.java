package java0905;
// 1. ������ Ŭ���� �����
class TimerThread extends Thread{
	int n=0;
	@Override
	//2. run()�޼��� �������̵�
	public void run() {
		while(true) {
			System.out.println(n++);
			try {
				sleep(1000);	// 1�� ������
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

	public static void main(String[] args) {	//main �����尡 ����
		TimerThread t = new TimerThread();
		t.start();

	}

}
