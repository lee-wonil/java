package java0902;

class EqClass{
	int x, y;
	public EqClass(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

public class ApiTest03 {
	public static void main(String[] args) {
		/*
		//객체 사이 == 연산자로 비교하면, 레퍼런스 비교(같은 메모리상 객체를 가르키는지)
		EqClass a = new EqClass(1,2);
		EqClass b = new EqClass(1,2);
		EqClass c = a;
		if(a==b) {
			System.out.println("a==b");
		}
		if(a==c) {
			System.out.println("a==c");
		}
		*/
		
		String a = new String("hello");
		String b = "hello";
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b))System.out.println("a equals b");
		String str1="abc";
		String str2="abc";
		// new 로 객체생성하지 않으면 JVM이 기존에 만든것(str1)이 만든것을
		// 재사용하게 됨.(리터럴) --> == 으로 비교시 같다고 결과가 나옴.
		if(str1==str2)System.out.println("true");
		else System.out.println("false");
		
		if(str1.equals(str2))System.out.println("true");
		else System.out.println("false");
				
	}
}
