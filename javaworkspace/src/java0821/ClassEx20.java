package java0821;

public class ClassEx20 {
	int x = 10;
	
	void add(int x) {
		this.x=x;
	}
	
	public static void main(String[] args) {
		ClassEx20 cls = new ClassEx20();
		cls.add(1000);
		System.out.println(cls.x);
	}
}
