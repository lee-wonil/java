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

		if(sb.equals(sb2)){	//StringBuffer Ŭ������ equals�޼��带 �������̵� ���� �ʴ´�. ����ص� ��񱳿�����(==) �� ���ѰͰ� ���� ����� ��´�.
			System.out.println("sb == sb2 ? true");
		}else{
			System.out.println("sb == sb2 ? false");
		}

		String s = sb.toString();	//toString() �� �������̵� �Ǿ��־ StinrgBuffer �ν��Ͻ��� toStiring() �� ȣ���ϸ� ����մ� ���ڿ��� String ���� ��ȯ�Ѵ�..
		String s2 = sb2.toString();

		if(s.equals(s2)){
			System.out.println("s.equals(s2) ? true");
		}else{
			System.out.println("s.equals(s2) ? false");
		}
	}
}
