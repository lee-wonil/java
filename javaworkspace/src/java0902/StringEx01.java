package java0902;

public class StringEx01 {
	public static void main(String[] args) {
		String java = "java";
		String cpp = "cpp";
		int result = java.compareTo(cpp);
		if(result == 0)System.out.println("the same");
		else if(result<0)System.out.println(java+"<"+cpp);
		else System.out.println(java+">"+cpp);
	}
}
