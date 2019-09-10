package java0827;

class ShapeClass{ // next , drow
	
	public ShapeClass next; // 다음에 올 객체의 주소를 담을 변수.
	public ShapeClass() { // 생성자 . next=null로 초기화해줌
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
	
}
class LineClass extends ShapeClass { // ShapeClass next , @drow
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class RectClass extends ShapeClass { // ShapeClass next , @drow
	public void draw() {
		System.out.println("Rect");
	}
}
class CircleClass extends ShapeClass { // ShapeClass next , @drow
	public void draw() {
		System.out.println("Circle");
	}
}


public class PolyEx10 {
	static void addLast(ShapeClass s) {
		
	}
	public static void main(String[] args) {
		ShapeClass start, last,obj;
		//start : 링크드 리스트의 첫번째 자료가 될 객체의 주소를 갖고 있을 레퍼런스 변수
		//last : 뒤에 따라올 (마지막의 위치할)객체의 주소를 담을 레퍼런스 변수
		//obj : 객체 생성할때 담아놓을 레퍼런스 변수
		start= new LineClass();		
		last = start;
		obj = new RectClass();
		last.next=obj;
		
		last= obj;
		obj = new LineClass();
		last.next=obj;
		
		last=obj;
		obj= new CircleClass();
		last.next=obj;
		
		//모든 도형을 출력
		ShapeClass s = start;
		while(s!=null) {
			s.draw();
			s=s.next;
		}
		
		
		
	}
}
