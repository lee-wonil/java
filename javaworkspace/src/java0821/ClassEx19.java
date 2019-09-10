package java0821;
class Circle1{
	int radius;
	//매개변수있는 생성자를 만들때에는 기본생성자 자동 생성이 안되니
	//필요에 따라 기본생성자도 직접 만들어줘야한다.(new Circle1)
	Circle1(int radius){
		this.radius=radius;
	}
	void set(int radius) {
		this.radius=radius;
	}
	double getArea() {
		return radius * radius * 3.14;
	}
}

public class ClassEx19 {

	public static void main(String[] args) {
//		Circle1 c = new Circle1();//에러발생
		Circle1 c= new Circle1(5);
		System.out.println(c.getArea());
		
		
	}

}
