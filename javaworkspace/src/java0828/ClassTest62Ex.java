package java0828;
// 상속문제
/*
 	#1. 
	아래 main()메소드 #1번과 아래 실행결과를 참고하여 TVClass를 상속받은 
	ColorTV클래스를 작성하세요. 
	실행결과 : 32인치 1024컬러
	
	#2. 위 1번 문제를 푼후, main()메소드 #2번과 아래 실행결과를 참고하여 
	ColorTV를 상속받는  IPTV클래스를 작성하세요.
	실행결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
*/
class TVClass {
	private int size;
	public TVClass(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TVClass{

	private int color;
	protected int getColor() { return color;	}
	public ColorTV(int size,int color) {
		super(size);
		this.color=color;		
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}	
}
class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip=ip;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}
public class ClassTest62Ex {
	public static void main(String[] args) {
		//#1. 
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048);
		iptv.printProperty();
		
	}
}
