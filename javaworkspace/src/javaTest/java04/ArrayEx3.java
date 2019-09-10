package javaTest.java04;
class  ArrayEx3{
	public static void main(String[] args) {
		int[] number=new int[10];
		for(int i =0; i < number.length;i++){
			number[i]=i+1;
		}
		System.out.println();
		for(int i = 0;i < 1000;i++){
			int n = (int)(Math.random()*10); //  5
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for(int i = 0;i < number.length ; i++){
			System.out.print(number[i]+"  ");
		}
	}
}
//random() 함수를 이용했기 때문에 실행할때마다 결과가 바뀐다.