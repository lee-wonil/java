package javaTest.java03;
class WhileEx1 {
	public static void main(String[] args) {
		int sum,su; 
		sum = su = 0; 
		int j = Integer.parseInt(args[0]);	//Scanner�� ��ä�ϱ�

		while(su <= j){
			sum += su;  
			su++;
		}
		System.out.println("1~" +j +"������ �� : "+sum); 
	}
}