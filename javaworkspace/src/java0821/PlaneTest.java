package java0821;

class PlaneTest{
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane(10);
		Plane p3 = new Plane("a380");
		Plane p4 = new Plane("airbus","a380",10);
		Plane p5 = new Plane("airbus","a380");
		p1.setCompany("boing");
		p1.setMaxPassenger(500);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(Plane.getPlanes());
	}
}
