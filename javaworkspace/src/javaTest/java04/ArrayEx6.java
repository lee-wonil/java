package javaTest.java04;
class  ArrayEx6{
	public static void main(String[] args) {
		int[] number = new int[10];
		int[] counter = new int[10];
		for(int i=0;i < number.length;i++){
			number[i]=(int)(Math.random()*10);  
		}
		System.out.println();
		for(int i=0;i < number.length;i++){
			counter[number[i]]++; 
		}
		for(int i=0;i<number.length;i++)
			System.out.println(i+"�� ���� :"+counter[i]);		
	}

}
