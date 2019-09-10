package java0902;

class Rect{
	private int width,height;
	Rect(int width,int height){
		this.width=width;
		this.height=height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r1 = (Rect)obj;
		if(r1.height*r1.width==height*width)return true;
		return false;
	}
}

public class ApiTest05 {
	public static void main(String[] args) {
		Rect a = new Rect(4,5);
		Rect b = new Rect(5,4);
		Rect c = new Rect(3,4);
		if(a.equals(b))System.out.println("a is equals to b");
		if(a.equals(c))System.out.println("a is equals to c");
		if(b.equals(c))System.out.println("b is equals to c");

	}
}
