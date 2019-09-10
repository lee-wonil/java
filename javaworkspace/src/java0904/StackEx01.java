package java0904;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("1");
		st.push("2");
		st.push("3");
		while(!st.empty()) {
			String s = st.pop();
			System.out.println(s);
		}
	}
}
