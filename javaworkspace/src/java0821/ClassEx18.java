package java0821;
class Circle{
	int radius;
	void set(int r) {
		radius=r;
	}
	double getArea() {
		return radius * radius * 3.14;
	}
}

public class ClassEx18 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.set(5);
		System.out.println(c.getArea());
		
		
	}

}
