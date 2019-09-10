package java0905;
class ThEx08 extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("-");
			for(int x=0;x<10;x++);
		}
	}
}
class ThEx09 extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("|");
			for(int x=0;x<10;x++);
		}
	}
}
public class ThreadEx08 {

	public static void main(String[] args) {
		ThEx08 th1 = new ThEx08();
		ThEx09 th2 = new ThEx09();
		th2.setPriority(7);		// 우선순위 변경
		th2.start();
		th1.start();
	}

}
