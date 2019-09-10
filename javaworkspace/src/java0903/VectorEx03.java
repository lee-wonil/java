package java0903;


import java.util.Vector;
//�� x,y�� ǥ���ϴ� Point Ŭ������ �����, Point�� ��ü�� �ٷ�� ���͸� �ۼ��غ���.
class Point{
	private int x,y;
	Point(int x, int y){
		this.x=x;
		this.y=y;		
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class VectorEx03 {

	public static void printVector(Vector<Point> v) {
		for(int i=0;i<v.size();i++) {
			Point p= v.get(i);
			System.out.println(p);
		}
	}
	
	
	public static void main(String[] args) {

		Vector<Point> v = new Vector<>();
		v.add(new Point(1,2));
		v.add(new Point(-10,20));
		v.add(new Point(100,200));
		System.out.println(v);
		v.remove(1);		
		printVector(v);
		
		
		
	}

}
