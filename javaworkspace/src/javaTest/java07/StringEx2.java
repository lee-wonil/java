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
		System.out.println("s2�� intern() �� ȣ������");

		if(s1 == s2){
			System.out.println("s1 == s2 ? true ");
		}else{
			System.out.println("s1 == s2 ? false ");
		}
	}
}


//intern() �� String �ν��Ͻ��� ���ڿ���constant pool�� ����ϴ� �����Ѵ�.
// ����ϰ��� �ϴ� ���ڿ��� �����Ұ�� �׹��ڿ��� �ּҰ��� ��ȯ�Ѵ�...