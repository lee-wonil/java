package javaTest.java08;
 class ThreadEx2 {
	public static void main(String args[]) throws Exception {
		MyThreadEx2_1 t1 = new MyThreadEx2_1();
		t1.start();
		System.out.println("����");
	}}
class MyThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();		
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}