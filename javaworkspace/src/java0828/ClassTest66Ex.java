package java0828;
// ���, ������
/*
 	Point2�� ��ӹ޾� 3������ ����  ��Ÿ���� Point3D Ŭ������ �ۼ��ϼ���. 
 	main()�޼ҵ� ���� �ڵ���� �����ϰ� �Ʒ��� ���� ������ ��µǰ� ���弼��. 
 	������:
		(1,2,3)�� ���Դϴ�.
		(1,2,4)�� ���Դϴ�. 
		(10,10,3)�� ���Դϴ�.
		(100,200,300)�� ���Դϴ�.
 */
class Point2 {
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class Point3D extends Point2{
	private int z;
	public Point3D(int x, int y,int z) {
		super(x, y);
		this.z=z;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+z+")�� ��";
	}
	public void moveUp() { z++; }
	public void moveDown() { z--; }
	public void move(int x, int y,int z) {
		move(x,y);this.z=z;
	}


}

public class ClassTest66Ex {
	public static void main(String[] args) {

		Point3D p = new Point3D(1,2,3);		// 1,2,3�� ���� x,y,z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");

		p.moveUp();		// z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");

		p.moveDown();	// z ������ �Ʒ��� �̵�
		p.move(10, 10);	// x,y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(100,200,300);	// z, y, z ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");

	}
}
