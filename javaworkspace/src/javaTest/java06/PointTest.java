package javaTest.java06;
class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point1 {
	int x;	
	int y;

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point1 {
	int z;

	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	String getLocation() {	// 오버라이딩
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}