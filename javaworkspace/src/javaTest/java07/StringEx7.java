package javaTest.java07;
class StringEx7 {
	public static void main(String[] args) {
		String [] number = {"1","2","3","4","5"};
		String result1 = "";
		int result2 = 0;

		for(int i = 0; i < number.length ; i++){
			result1 += number[i];
			result2 += Integer.parseInt(number[i]);	//String 형을 int 형으로 변환 
		}
		System.out.println(result1);
		System.out.println(result2);
	}
}
