package java0823;
/*
직사각형을 표현하는 Rectangle 클래스를 작성하세요. 
- int 타입의 x, y, width, heigth 필드 : 사각형을 구성하는 점과 크기 정보
- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
- int squareArea() : 사각형 넓이 리턴
- void show() : 사각형의 좌표와 넓이 출력
- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
- 콘솔출력결과:
	(2,2)에서 크기가 8x7인 사각형
	b의 면적은 36
	c는 a을 포함합니다.
*/
class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x,int y,int width,int height){
		this.x=x;
		this.y=x;
		this.width=width;
		this.height=height;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int squareArea() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");//(2,2)에서 크기가 8x7인 사각형
	}
	boolean contains(Rectangle r) {
		int rx=r.x;
		int ry=r.y;
		int rwidth =r.width;
		int rheight=r.height;
		if(rx>x&&rx+rwidth<x+width&&ry>y&&ry+rheight<y+height) {
			//rx>x x와 객체의 x좌표를 우선 비교하여 만약 객체의 x좌표가 x의 좌표보다 작은 경우에는 크기 때문에 포함이 되지 않는다
			//rx+rwidth<x+width 사각형의 끝 좌표를 비교
			return true;
		}
		else {
			return false;
		}
	}
}

public class ClassEx35 {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(2, 2, 8, 7); 
		Rectangle b = new Rectangle(5, 5, 6, 6); 
		Rectangle c = new Rectangle(1, 1, 10, 10); 
		
		a.show();		
		System.out.println("b의 면적은 "+ b.squareArea());
		
		if(c.contains(a)) System.out.println("c는 a를 포함합니다.");
		if(c.contains(b)) System.out.println("c는 b를 포함합니다.");
		
		
	}

}
