package javaTest.java07;
class StringEx61{
	public static void main(String[] args){
		String s1 = "  abc  "; 
		String msg = null;

		msg = s1.replace("a","b"); //  bbc
		System.out.println("msg :"+msg);

		msg = s1.toUpperCase(); // BBC
		System.out.println("msg :"+msg);

		msg = s1.trim(); // 공백 삭제
		System.out.println("msg :"+msg);
	}
}