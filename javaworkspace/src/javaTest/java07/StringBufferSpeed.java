package javaTest.java07;
class  StringBufferSpeed{
	public static void main(String[] args) {
		long start, end;
		String str1 = new String("1~1000�� �� : ");
		StringBuffer str2 = new StringBuffer("1~1000�� �� : ");
		start = System.currentTimeMillis();
		for(int i = 1; i <= 10000 ; i++){
			str1 += i;
			str1 += "+";
		}
		end = System.currentTimeMillis();//����ý����� �������ִ� �ð��� õ���� 1�ʷ� �ٲ۴� 
		System.out.println("String : "+(end - start));
		start = System.currentTimeMillis();
		for(int i = 1; i <= 30000 ; i++){
			str2.append(i);
			str2.append("+");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer : "+(end - start));

	}
}
