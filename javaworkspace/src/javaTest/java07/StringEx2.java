package javaTest.java07;
class StringEx2
{
	public static void main(String[] args) 
	{
		String s1 = "AAA";
		String s2 = new String("AAA");

		if(s1 == s2){
			System.out.println("s1 == s2 ? true ");
		}else{
			System.out.println("s1 == s2 ? false ");
		}

		s2 = s2.intern();
		System.out.println("s2에 intern() 을 호출한후");

		if(s1 == s2){
			System.out.println("s1 == s2 ? true ");
		}else{
			System.out.println("s1 == s2 ? false ");
		}
	}
}


//intern() 은 String 인스턴스의 문자열을constant pool에 등록하는 일을한다.
// 등록하고자 하는 문자열이 존재할경우 그문자열의 주소값을 반환한다...