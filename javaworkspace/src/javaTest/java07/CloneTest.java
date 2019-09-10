package javaTest.java07;
class Point implements Cloneable	//cloneable 인터페이스를 구현한 클래스 에서만 clone()을 호출할수있다. 
{
	int x ,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x = "+x+", y = "+y;
	}
	public Point copy(){
		Object obj = null;
		try{
			obj = clone();	//clone() 메서드에는 CloneNotSupportedException 이 선언되어있으므로 try-catch 문을 사용해야한다.
		}catch(CloneNotSupportedException e){}
		return (Point)obj;
	}
}
class CloneTest
{
	public static void main(String[] args) 
	{
		Point original = new Point(3,5);
		Point copy = original.copy();
		
		System.out.println(original);
		System.out.println(copy);
	}
}

//clone() 메서드의 접근제어자는 protected 이다. 
