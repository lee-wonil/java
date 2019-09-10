package javaTest.java07;
class  StringBufferSpeed{
	public static void main(String[] args) {
		long start, end;
		String str1 = new String("1~1000의 합 : ");
		StringBuffer str2 = new StringBuffer("1~1000의 합 : ");
		start = System.currentTimeMillis();
		for(int i = 1; i <= 10000 ; i++){
			str1 += i;
			str1 += "+";
		}
		end = System.currentTimeMillis();//현재시스템이 가지고있는 시간을 천분의 1초로 바꾼다 
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
