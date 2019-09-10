package editplus;

class Test06 {
	public static void main(String[] args){
		// 업/다운 캐스팅이 들어있는 코드로 실행결과 먼저 예측해보자
		byte b = 127;
		int i =100;
		System.out.println(b+i);
		// byte + int == int
		System.out.println(10/4); // int /int == int
		System.out.println(10.0/4);
		System.out.println((byte)(b+i)); //227 (byte -128~127)
		System.out.println((int)2.9+1.8);//2+1.8=3.8
		System.out.println((int)(2.9+1.8));//4.7 = 4
		System.out.println((int)2.9+(int)1.8);//2+1=3
	}
}
