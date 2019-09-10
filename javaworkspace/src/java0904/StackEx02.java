package java0904;

import java.util.Stack;
// �� �������� �ڷ�/ ������ ���� ��� ����
public class StackEx02 {
	public static Stack<String> back = new Stack<>();		// �ڷ� ���� ������ ����
	public static Stack<String> forword = new Stack<>();	// ������ ���� ������ ����
	// �������
	public static void printStatus() {
		System.out.println("back : "+back);
		System.out.println("forword : "+forword);
		System.out.println("����ȭ�� : "+back.peek());
	}
	// URL�� �̵�
	public static void goURL(String url) {
		back.push(url);		//url �̵���, back�� ��ܿ� ����
		if(!forword.empty()) {	// url �̵���, ������ ���� ��� �����
			forword.clear();
		}
	}
	// ������ ����
	public static void goForward() {
		if(!forword.empty()) {
			back.push(forword.pop());
		}
	}
	// �ڷ� ����
	public static void goBack() {
		if(!back.empty()) {
			forword.push(back.pop());
		}
	}
	
	public static void main(String[] args) {
		goURL("1.���̹�");
		goURL("2.����");
		goURL("3.����");
		goURL("4.���۵���̺�");
		printStatus();
		goBack();
		System.out.println("�ڷΰ��� ��ư ���� �� ");
		printStatus();
		goBack();
		System.out.println("�ڷΰ��� ��ư ���� �� ");
		printStatus();
		goForward();
		System.out.println("�����ΰ��� ��ư ���� �� ");
		printStatus();
	}
}
