package java0827;
// 오버라이딩으로 다형성 실현
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
	public String toString() {
		return "shape";
	}
}
class Line extends Shape{
	@Override
	public void draw(){
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


public class PolyEx09 {
	static void paint (Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		
		Line l = new Line();
		paint(l);
		paint(new Circle());
		paint(new Line());
		paint(new Rect());
		paint(new Shape());
		/*
		Shape s = new Shape();
		s.draw();
		Line l = new Line();
		l.draw();
		Rect r = new Rect();
		r.draw();
		s= new Circle();
		s.draw();
		paint(s);
		*/
	}

}
