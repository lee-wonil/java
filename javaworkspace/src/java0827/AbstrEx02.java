package java0827;
//����. �Ʒ� �߻�Ŭ���� Calculater�� ��ӹ��� MyCalc Ŭ������ �����ϼ���
//		���ο��� MyCalc ��ü �����Ͽ� ���� �޼��带 Ȱ���Ͽ� �׽�Ʈ ���� �غ���
abstract class Calculator{
	public abstract int add(int a,int b); 			//�� ������ ���� ����
	public abstract int subtract(int a,int b);		//�� ������ ���� ����
	public abstract double average(int a[]);		// �迭�� ����� ������ ��հ� ����
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