package javaTest.java01;
class SpecialChar01 {
	public static void main(String[] args) 
	{
		char single = '\'';				//  single = ''';와 같이 할 수 없다.
		String dblQuote = "\"Hello\"";	//  겹따옴표를 출력하려면 이렇게 한다.
		String root = "c:\\";

		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);

			//이스케이프 문자 출력
		System.out.println("이스케이프 문자 출력");
		System.out.println("1. abcdefg\bhijklmn");
		System.out.println("2. abcdefg\thijklmn");
		System.out.println("3. abcdefg\nhijklmn");
		System.out.println("4. abcdefg\fhijklmn");
		System.out.println("5. abcdefg\rhijklmn");
		System.out.println("6. abcdefg\"hijklmn");
		System.out.println("7. abcdefg\'hijklmn");
		System.out.println("8. abcdefg\\hijklmn");
	}
}