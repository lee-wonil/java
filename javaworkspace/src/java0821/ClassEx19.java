package java0821;
class Circle1{
	int radius;
	//�Ű������ִ� �����ڸ� ���鶧���� �⺻������ �ڵ� ������ �ȵǴ�
	//�ʿ信 ���� �⺻�����ڵ� ���� ���������Ѵ�.(new Circle1)
	Circle1(int radius){
		this.radius=radius;
	}
	void set(int radius) {
		this.radius=radius;
	}
	double getArea() {
		return radius * radius * 3.14;
	}
}

public class ClassEx19 {

	public static void main(String[] args) {
//		Circle1 c = new Circle1();//�����߻�
		Circle1 c= new Circle1(5);
		System.out.println(c.getArea());
		
		
	}

}
