package javaTest.java01;
class  FloatTest01 {
	public static void main(String args[]) {
		float   floatVar1;
		double  doubleVar1;

		//floatVar1 = 2.5; 이렇게 쓰면 2.5는 double type임으로 에러남
		floatVar1 = 2.5f;
		doubleVar1 = 2.5;

		System.out.println("floatVar1 = "+floatVar1);
		System.out.println("doubleVar1 = "+doubleVar1);

	}
}
