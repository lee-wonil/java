package javaTest.java04;
class  ArrayEx4
{
	public static void main(String[] args) {
		int[] ball = new int[45];
		for(int i =0; i < ball.length ; i++){
			ball[i] = i +1; // [0]��°�� 1 ���� ����ȴ�.
		}
		int temp = 0; // �ΰ��� �ٲܶ� ����� �ӽ� ����
		int j = 0;  // ���� ���� �� ������ ����

		for(int i =0;i<100;i++){
			j = (int)(Math.random()*45); // �迭���� 0~44 �� ���ǰ��� ��´�.
			temp = ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
			//ball[0] ���� ball[j] ���� ���� �ٲ۴�.
		}
		for(int i=0;i <=6; i++){
			System.out.print(ball[i]+" ");
		}
	}
}

