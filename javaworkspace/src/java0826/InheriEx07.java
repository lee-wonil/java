package java0826;

class Super2{
	void add() {
		System.out.println("super!!");
	}
	
}
class Sub2 extends Super2{
	void add() {
		System.out.println("subsub");
		super.add();		
		System.out.println("subsub");
		System.out.println("subsub");
	}
}

public class InheriEx07 {

	public static void main(String[] args) {
		Sub2 sub= new Sub2();
		sub.add();

	}

}
