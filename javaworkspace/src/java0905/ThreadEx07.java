package java0905;

import javax.swing.JOptionPane;

class ThEx06 extends Thread{
	public void run() {
		System.out.println("10�ʾȿ� ���� �Է��ؾ� �մϴ�.");
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		ThreadEx07.inputCheck = true;
		System.out.println("�Է°��� "+input+"�Դϴ�.");
	}
}
class ThEx07 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			if(ThreadEx07.inputCheck){
				return;
			}
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {	}
		}
	}
}

public class ThreadEx07 {
	static boolean inputCheck = false;
	public static void main(String[] args) {
		ThEx06 th1 = new ThEx06();
		ThEx07 th2 = new ThEx07();
		th1.start();
		th2.start();

	}

}
