package java0827;
//문제. 아래 추상클래스 Calculater를 상속받은 MyCalc 클래스를 구현하세요
//		메인에서 MyCalc 객체 생성하여 각각 메서드를 활용하여 테스트 까지 해보기
abstract class Calculator{
	public abstract int add(int a,int b); 			//두 정수의 합을 리턴
	public abstract int subtract(int a,int b);		//두 정수의 차를 리턴
	public abstract double average(int a[]);		// 배열에 저장된 정수의 평균값 리턴
}
class MyCalc extends Calculator{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int a[]) {
		double d=0;
		for(int i=0;i<a.length;i++) {
			d+=a[i];
		}		
		return d/a.length;
	}
	
}
public class AbstrEx02 {

	public static void main(String[] args) {
		MyCalc my = new MyCalc();
		System.out.println(my.add(10,5 ));
		System.out.println(my.subtract(10, 5));
		int [] a = {5,9,7,6,8,5,6};
		System.out.println(my.average(a));
		//System.out.println(my.average(new int[] {5,9,7,6,8,5,6}));


	}
}