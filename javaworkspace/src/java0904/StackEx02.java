package java0904;

import java.util.Stack;
// 웹 브라우저에 뒤로/ 앞으로 가기 기능 구현
public class StackEx02 {
	public static Stack<String> back = new Stack<>();		// 뒤로 가기 데이터 저장
	public static Stack<String> forword = new Stack<>();	// 앞으로 가기 데이터 저장
	// 상태출력
	public static void printStatus() {
		System.out.println("back : "+back);
		System.out.println("forword : "+forword);
		System.out.println("현재화면 : "+back.peek());
	}
	// URL로 이동
	public static void goURL(String url) {
		back.push(url);		//url 이동시, back에 상단에 저장
		if(!forword.empty()) {	// url 이동시, 앞으로 가기 모두 지우기
			forword.clear();
		}
	}
	// 앞으로 가기
	public static void goForward() {
		if(!forword.empty()) {
			back.push(forword.pop());
		}
	}
	// 뒤로 가기
	public static void goBack() {
		if(!back.empty()) {
			forword.push(back.pop());
		}
	}
	
	public static void main(String[] args) {
		goURL("1.네이버");
		goURL("2.다음");
		goURL("3.구글");
		goURL("4.구글드라이브");
		printStatus();
		goBack();
		System.out.println("뒤로가기 버튼 누른 후 ");
		printStatus();
		goBack();
		System.out.println("뒤로가기 버튼 누른 후 ");
		printStatus();
		goForward();
		System.out.println("앞으로가기 버튼 누른 후 ");
		printStatus();
	}
}
