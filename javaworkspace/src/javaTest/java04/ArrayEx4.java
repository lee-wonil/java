package javaTest.java04;
class  ArrayEx4
{
	public static void main(String[] args) {
		int[] ball = new int[45];
		for(int i =0; i < ball.length ; i++){
			ball[i] = i +1; // [0]번째에 1 부터 저장된다.
		}
		int temp = 0; // 두값을 바꿀때 사용할 임시 변수
		int j = 0;  // 임의 값을 얻어서 저장할 변수

		for(int i =0;i<100;i++){
			j = (int)(Math.random()*45); // 배열범위 0~44 의 임의값의 얻는다.
			temp = ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
			//ball[0] 값과 ball[j] 값을 서로 바꾼다.
		}
		for(int i=0;i <=6; i++){
			System.out.print(ball[i]+" ");
		}
	}
}

