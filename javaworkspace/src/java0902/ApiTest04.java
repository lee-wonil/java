package java0902;

class Point2{
	int x,y;
	public Point2(int x,int y) {
		this.x=x;
		this.y=y;
	}
	// String 클래스의 equals()를 오버라이딩 하듯이, Point2 클래스에서
	// equals()를 오버라이딩 한 것.
	@Override
	public boolean equals(Object obj) {
		Point2 p = (Point2)obj;
		if(p.x==x&&p.y==y){
			return true;
		}
		return false;
	}
}

public class ApiTest04 {
	public static void main(String[] args) {
		Point2 a = new Point2(1,2);
		Point2 b = new Point2(1,2);
		Point2 c = new Point2(2,3);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

	}
}
