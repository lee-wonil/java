package java0828;

import java.util.Scanner;

// 인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 StackApp클래스에 main() 메소드를 작성하세요. (답은 그냥 파일명 클래스안에 main 작성)
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴 
	boolean push(String val);		// 스택의 톱(top)에 문자열 저장
}
class StackApp implements Stack{
	Scanner sc;
	private int size;
	private int count=0;
	private String[] words;
	public StackApp(){
		sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		size = Integer.parseInt(sc.nextLine());		
		words = new String[size];
	}
	@Override
	public int length() {
		return capacity()-count;
	}
	@Override
	public int capacity() {
		return words.length;
	}
	@Override
	public String pop() {
		String s =words[--count];
		words[count]=null;
		return s;
	}
	@Override
	public boolean push(String val) {
		if(length()>0) {
			words[count++]=val;
			return true;
		}
		else return false;
	}
	public void run() {		
		while(true) {
			System.out.print("문자열 입력 >>");
			String input=sc.nextLine();
			if(input.equals("그만")) {				
				break;
			}
			if(!push(input)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
			
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i=count-1;i>=0;i--) {
			System.out.print(pop()+" ");
		}
		sc.close();
	}
}


public class ClassTest68Ex {
	public static void main(String[] args) {
		StackApp s = new StackApp();
		s.run();

	}
}


