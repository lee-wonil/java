package java0902;

class Point {
	int x,y;
	public Point(int x, int y) {
		this.x =x;this.y=y;
	}
	@Override
	public String toString() {
		return "Point Ŭ����";
	}
	
}

public class ApiTest02 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Point  p =new Point(2,5);
		print(p);
		
		Point a = new Point(1,3);
		print(a);
		Point b= new Point(2,5);
		if(p==a)System.out.println("p==a");	// ���۷����� �ٸ�
		if(p.equals(a))System.out.println("p is equals to a");// ���۷����� �ٸ�
		if(p.equals(p))System.out.println("p is equals to p");// ���۷����� ����
		if(p.equals(b))System.out.println("p is equals to b");// ���۷����� ����

	}
}
