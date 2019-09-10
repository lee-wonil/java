package javaTest.java04;
class  ArrayEx1{
	public static void main(String[] args) {
		int sum = 0;  // ÃÑÁ¡
		float average = 0f;  // Æò±Õ 
		
		int[] score = {100,88,100,100,90};  // 5°³ÀÇ ¹æ 
		for(int i=0;i < score.length;i++){   
			sum += score[i]; 
		}
		average = sum / (float)score.length; 

		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+average);
	}
}

