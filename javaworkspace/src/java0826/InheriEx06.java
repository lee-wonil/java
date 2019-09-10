package java0826;

class Super1{
	void add() {
		System.out.println("super");
	}
}
class Sub1 extends Super1{
	//오버라이딩 : 부모의 메서드 내용이 마음에 안들어 내가 내용을 재정의한것
	@Override// 어노테이션(annotataion)	
	void add() {
		System.out.println("sub");
	}
}

public class InheriEx06 {

	public static void main(String[] args) {
		Sub1 sub = new Sub1();
		sub.add();
		Super1 sup= new Super1();
		sup.add();
	}

}
