package java0905;

class ThEx extends Thread{
	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			System.out.println("run");
		}
	}
	// ���� : ���ѹݺ��� ���������� ���� ���� ��쿡�� ������ ���� �Ұ�
}

public class ThreadEx02 {
	public static void main(String[] args) {
		ThEx th1 = new ThEx();
		ThEx th2 = new ThEx();
		th1.start();
		th2.start();
		//th.start();
		//th.run();	// �ܼ� �޼��� ȣ�� : run()�� �� ������ �Ŀ� �Ʒ� �ݺ��� ���� : �̱۽�����
		for(int i = 0;i<100;i++) {
			System.out.println("main");
		}
		System.out.println("����");
	}
}
