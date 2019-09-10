package java0821;


public class ClassEx16 {
	double d;
	//생성자 : 메모리 차지하지 않는다.
	//		    메모리를 차지하는 것은 변수와 메서드
	//		    생성자까지 마치면 제품이 비로써 생성된 것임
	ClassEx16(){
		d= Math.random();
	}
	ClassEx16(double d){
		this.d= d;
	}
	public static void main(String[] args) {	
		ClassEx16 c1 = new ClassEx16();
		System.out.println(c1.d);
		ClassEx16 c2 = new ClassEx16(12.5);
		System.out.println(c2.d);
		ClassEx16 c3 = new ClassEx16(3);
		System.out.println(c3.d);
	}
}
