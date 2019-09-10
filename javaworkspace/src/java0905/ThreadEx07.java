package java0905;

import javax.swing.JOptionPane;

class ThEx06 extends Thread{
	public void run() {
		System.out.println("10초안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		ThreadEx07.inputCheck = true;
		System.out.println("입력값은 "+input+"입니다.");
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
