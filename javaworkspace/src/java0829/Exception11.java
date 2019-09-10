package java0829;

import java.io.IOException;

public class Exception11 {
	public static void main(String[] args) {
		try {
			//Exception e = new Exception();			
			//NullPointerException e = new NullPointerException();
			//RuntimeException e = new RuntimeException();
			throw new IOException();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException 발생");
		}catch(Exception e) {
			System.out.println("나머지 모든 예외 처리 ");
		}
	}
}
