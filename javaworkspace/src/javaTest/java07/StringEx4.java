package javaTest.java07;
class StringEx4 
{
	static String s;	//참조변수 s 는 멤버변수 이기때문에 따로 초기화해주지 않으면 기본값인null 변환후 연산한다..
	static String s2 = "";

	public static void main(String[] args) 
	{
		for(int i = 1;i<10;i++){
			s += i;
			s2 += i;
		}
		System.out.println(s);
		System.out.println(s2);
	}
}
