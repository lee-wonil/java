package java0820;
class Circle{
	int radius = 30;
	
	
}

public class ClassEx09 {
	//���� ��ü ������ �ʰ� �ϱ� ���ؼ�
	static void plus(int num) {
		num=num+1;
		System.out.println("plus:"+num);
	}
	static void biggerCircle(Circle c) {
		c.radius++;
		
	}
	static void arrayPlus(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
	}
	
	public static void main(String[] args) {
		//�⺻�� ���� ���� �׽�Ʈ
		int num =10;
		System.out.println("1 :"+num);
		plus(num);
		System.out.println("2 :"+num);
		// ������ ���� ���� �׽�Ʈ
		Circle c = new Circle();
		System.out.println("1 circle "+c.radius);
		biggerCircle(c);
		System.out.println("2 circle "+c.radius);
		// �迭 ���� ���� �׽�Ʈ
		int [] arr = {1,2,3,4,5};
		System.out.println("arr1------------");
		for(int a: arr) System.out.print(a+" ");
		arrayPlus(arr);
		System.out.println();
		System.out.println("arr2------------");
		for(int a: arr) System.out.print(a+" ");
	}

}
