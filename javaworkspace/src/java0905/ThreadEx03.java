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
		//my.start();	//��Ƽ������ : main stack ��� X,run()���� ����
		//my.run();		//�̱۽����� : �ֿܼ� main stack ���
		System.out.println("����");
	}
}
