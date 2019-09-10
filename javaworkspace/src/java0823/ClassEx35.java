package java0823;
/*
���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��ϼ���. 
- int Ÿ���� x, y, width, heigth �ʵ� : �簢���� �����ϴ� ���� ũ�� ����
- x, y, width, height ���� �Ű������� �޾� �ʵ带 �ʱ�ȭ�ϴ� ������
- int squareArea() : �簢�� ���� ����
- void show() : �簢���� ��ǥ�� ���� ���
- boolean contains(Rectangle r) : �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
- �ܼ���°��:
	(2,2)���� ũ�Ⱑ 8x7�� �簢��
	b�� ������ 36
	c�� a�� �����մϴ�.
*/
class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x,int y,int width,int height){
		this.x=x;
		this.y=x;
		this.width=width;
		this.height=height;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int squareArea() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");//(2,2)���� ũ�Ⱑ 8x7�� �簢��
	}
	boolean contains(Rectangle r) {
		int rx=r.x;
		int ry=r.y;
		int rwidth =r.width;
		int rheight=r.height;
		if(rx>x&&rx+rwidth<x+width&&ry>y&&ry+rheight<y+height) {
			//rx>x x�� ��ü�� x��ǥ�� �켱 ���Ͽ� ���� ��ü�� x��ǥ�� x�� ��ǥ���� ���� ��쿡�� ũ�� ������ ������ ���� �ʴ´�
			//rx+rwidth<x+width �簢���� �� ��ǥ�� ��
			return true;
		}
		else {
			return false;
		}
	}
}

public class ClassEx35 {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(2, 2, 8, 7); 
		Rectangle b = new Rectangle(5, 5, 6, 6); 
		Rectangle c = new Rectangle(1, 1, 10, 10); 
		
		a.show();		
		System.out.println("b�� ������ "+ b.squareArea());
		
		if(c.contains(a)) System.out.println("c�� a�� �����մϴ�.");
		if(c.contains(b)) System.out.println("c�� b�� �����մϴ�.");
		
		
	}

}
