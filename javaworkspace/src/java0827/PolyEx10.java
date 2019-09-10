package java0827;

class ShapeClass{ // next , drow
	
	public ShapeClass next; // ������ �� ��ü�� �ּҸ� ���� ����.
	public ShapeClass() { // ������ . next=null�� �ʱ�ȭ����
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
		//start : ��ũ�� ����Ʈ�� ù��° �ڷᰡ �� ��ü�� �ּҸ� ���� ���� ���۷��� ����
		//last : �ڿ� ����� (�������� ��ġ��)��ü�� �ּҸ� ���� ���۷��� ����
		//obj : ��ü �����Ҷ� ��Ƴ��� ���۷��� ����
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
		
		//��� ������ ���
		ShapeClass s = start;
		while(s!=null) {
			s.draw();
			s=s.next;
		}
		
		
		
	}
}
