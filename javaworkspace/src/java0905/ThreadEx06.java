package java0905;

import javax.swing.JOptionPane;

class ThEx04 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);				
			}catch(Exception e) {	}
		}
	}
}

public class ThreadEx06 {

	public static void main(String[] args) {
		ThEx04 th = new ThEx04();
		th.start();
		String input= JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");

		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
		th.interrupt();
	}

}
