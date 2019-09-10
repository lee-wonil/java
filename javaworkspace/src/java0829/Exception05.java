package java0829;

public class Exception05 {
	public static void main(String[] args) {
		String [] stringNumer= {"23","12","3.141592","999"};
		int i =0;
		try {
			for(i=0;i<stringNumer.length;i++) {
				//java.lang.NumberFormatException 실수문자ㅇㄹ-> 정수 변환할때 발생
				int j = Integer.parseInt(stringNumer[i]); 
				System.out.println("정수로 변환된 값은 " +j);
			}
		}catch(Exception e) {	//예외 발생시 더 이상 반복문을 실행하지 않는다.
			System.out.println(stringNumer[i]+"는 정수로 변환 할수 없습니다.");
		}//try 범위 지정할때 주의.

	}
}
