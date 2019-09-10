
package java0819;
//#1. 클래스 구현 : TV
class Tv{
	boolean power=false;
	int vol=0,ch=1;
	
	
}

public class ClassEx03 {
	public static void main(String[] args) {
		//#2. 객체(인스턴스) 생성 : 메모리에 올리기
		Tv t; // 선언
		t= new Tv();// 생성
		/*
		System.out.println(t);
		System.out.println(t.ch);
		System.out.println(t.power);
		System.out.println(t.vol);
		*/
		//객체 여러개 만들기
		Tv t1=new Tv();
		Tv t2=new Tv();
		Tv t3=new Tv();
		Tv t4=new Tv();
		// 객체마다 각각 따로 데이터 저장됨
		t1.ch=10;
		t2.ch=20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		/*
		// 메모리 해체
		t=null;
		t1=null;
		t2=null;
		t3=null;
		t4=null;
		*/
		//가능(같은 타입)
		t1=t2;
		t2=t1;
		
		//불가능(다른 타입)
		//t1=t2.ch;
		
		//메인메서드를 포함하는 ClassEx03또한 클래스 이므로 객체생성가능함
		ClassEx03 cls = new ClassEx03();
		String str = new String();

	}

}


