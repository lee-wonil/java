package javaTest.java08;
 class ThreadEx13 {
	static long startTime = 0;
	public static void main(String args[]) {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		ThreadEx13_2 th2 = new ThreadEx13_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		try {
			th1.join();	// th1�� �۾��� ���� ������ ��ٸ���.
			th2.join();	// th2�� �۾��� ���� ������ ��ٸ���.
		} catch(InterruptedException e) {}
		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis()
														   - ThreadEx13.startTime));
	} }
class ThreadEx13_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}} }
class ThreadEx13_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}} }