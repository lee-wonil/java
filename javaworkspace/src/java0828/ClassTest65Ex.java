package java0828;
// ���, ������
/*
 	Point1�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint1 Ŭ������ �ۼ��ϼ���. 
 	main()�޼ҵ� ���� �ڵ���� �����ϰ� �Ʒ��� ���� ������ ��µǰ� ���弼��. 
 	������:
 		BLACK���� (0,0)�� ���Դϴ�. 
 		RED���� (5,5)�� ���Դϴ�.
*/
class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint1 extends Point1{

	private String color;
	public ColorPoint1() {
		super(0,0);
		color="BLACK";
	}
	public ColorPoint1(int x, int y) {
		super(x, y);
		color="BLACK";
	}
	public void setXY(int x,int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return color+"���� ("+getX()+","+getY()+")�� ��";
	}
}


public class ClassTest65Ex {
	public static void main(String[] args) {
		
		ColorPoint1 zeroPoint = new ColorPoint1();	// (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint1 cp = new ColorPoint1(10,10);	// (10,10) ��ġ�� BLACK �� ��
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
		
	}
}
