package javaTest.java07;
class StringBufferEx1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		if(sb == sb2){
			System.out.println("sb == sb2 ? true");
		}else{
			System.out.println("sb == sb2 ? false");
		}

		if(sb.equals(sb2)){	//StringBuffer 클래스는 equals메서드를 오버라이딩 하지 않는다. 사용해도 등가비교연산자(==) 로 비교한것과 같은 결과를 얻는다.
			System.out.println("sb == sb2 ? true");
		}else{
			System.out.println("sb == sb2 ? false");
		}

		String s = sb.toString();	//toString() 은 오버라이딩 되어있어서 StinrgBuffer 인스턴스에 toStiring() 을 호출하면 담고잇는 문자열을 String 으로 반환한다..
		String s2 = sb2.toString();

		if(s.equals(s2)){
			System.out.println("s.equals(s2) ? true");
		}else{
			System.out.println("s.equals(s2) ? false");
		}
	}
}
