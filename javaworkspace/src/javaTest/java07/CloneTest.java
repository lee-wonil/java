package javaTest.java07;
class Point implements Cloneable	//cloneable �������̽��� ������ Ŭ���� ������ clone()�� ȣ���Ҽ��ִ�. 
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
			obj = clone();	//clone() �޼��忡�� CloneNotSupportedException �� ����Ǿ������Ƿ� try-catch ���� ����ؾ��Ѵ�.
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

//clone() �޼����� ���������ڴ� protected �̴�. 
