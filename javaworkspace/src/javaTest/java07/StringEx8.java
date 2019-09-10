package javaTest.java07;
class StringEx8 
{
	public static void main(String[] args) 
	{
		String fullName = "Hello.java";

		int index = fullName.indexOf('.');	//fullName 에서 '.' 위치를 찾는다.

		String fileName = fullName.substring(0,index);	//fullName 의 첫번째 문자에서 '.' 위치까지 문자열을 추출한다.

		String ext = fullName.substring(index+1);	//fullName 의 '.'위치에서 끝까지 추출한다.

		System.out.println(fullName + "의 확장자를 제외한 이름은 "+fileName);
		System.out.println(fullName + "의 확장자는 "+ext);
	}
}
