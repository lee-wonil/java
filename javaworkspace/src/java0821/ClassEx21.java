package java0821;
class Circle2{
	int radius;
	Circle2(int radius){
		this.radius=radius;
	}
	void setRadius(int radius) {
		this.radius=radius;
	}
}

public class ClassEx21 {
	public static void main(String[] args) {
		Circle2 c = new Circle2(10);
		Circle2 c1 = new Circle2(20);
		Circle2 c2 = new Circle2(30);
		System.out.println(c.radius);
		System.out.println(c1.radius);
		System.out.println(c2.radius);
		c.setRadius(100);
		c1.setRadius(200);
		c2.setRadius(300);
		System.out.println(c.radius);
		System.out.println(c1.radius);
		System.out.println(c2.radius);

	}
}
