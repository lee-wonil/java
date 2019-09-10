package java0828;
// ���, ������
/*
 	Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��ϼ���. 
 	main()�޼ҵ� ���� �ڵ���� �����ϰ� �Ʒ��� ���� ������ ��µǰ� ���弼��. 
 	������:
 		RED���� (10,20)�� ���Դϴ�.
*/
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint extends Point{

	private String color;
	public ColorPoint(int x, int y,String color) {
		super(x, y);
		this.color=color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setXY(int x,int y) {
		move(x,y);
		
		//super.move(x,y);	//ColorPoint�� �������̵��� ���������� super.move()�� ����ص� ����
	}
	public String toString() {
		String s =color+"���� ("+getX()+","+getY()+")�� ��" ;
		return s;
	}
}

public class ClassTest64Ex {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"�Դϴ�.");
	}
}
