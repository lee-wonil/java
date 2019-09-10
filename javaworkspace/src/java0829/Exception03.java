package java0829;

public class Exception03 {
	public static void main(String[] args) {
		int number=100;
		int result =0;

		for(int i =0;i<10;i++) {
			try {
				result= number/(int)(Math.random()*10);
				System.out.println(result);
			}catch(Exception e) {
				System.out.println("0으로 나눌수 없습니다.");
			}
		}

	}
}
