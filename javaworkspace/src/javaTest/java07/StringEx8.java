package javaTest.java07;
class StringEx8 
{
	public static void main(String[] args) 
	{
		String fullName = "Hello.java";

		int index = fullName.indexOf('.');	//fullName ���� '.' ��ġ�� ã�´�.

		String fileName = fullName.substring(0,index);	//fullName �� ù��° ���ڿ��� '.' ��ġ���� ���ڿ��� �����Ѵ�.

		String ext = fullName.substring(index+1);	//fullName �� '.'��ġ���� ������ �����Ѵ�.

		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸��� "+fileName);
		System.out.println(fullName + "�� Ȯ���ڴ� "+ext);
	}
}
