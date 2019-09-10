package java0828;

import java.util.Scanner;

// 추상클래스
/*
	텍스트로 입출력하는 간단한 그래픽 편집기 만들기. 
	아래 추상클래스 ShapeAbst를 상속받은 Line, Rect, Circle 클래스를 만들고, 
	실행 예시처럼 "삽입", "삭제", "모두보기", "종료"의 4가지 그래픽 편집 기능을 가진 
	클래스 GraphicEditor를 작성하세요.
	실행예시 : 
		그래픽 에디터를 실행합니다. 원하는 기능의 번호를 눌러주세요.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1 (사용자 입력)
		1.Line  2.Rect  3.Circle >>  2
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1
		1.Line  2.Rect  3.Circle >>  3
		1.삽입  2.삭제  3.모두보기  4.종료 >>  3
		Rect
		Circle
		1.삽입  2.삭제  3.모두보기  4.종료 >>  2
		삭제할 도형의 위치 >> 3
		삭제할 수 없습니다.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  4
		에디터를 종료합니다.
 */
abstract class ShapeAbst {
	private ShapeAbst next;
	public ShapeAbst() { next = null; }
	public void setNext(ShapeAbst obj) { next = obj; }	// 링크 연결
	public ShapeAbst getNext() { return next; }
	abstract public void draw();						// 추상메서드 : 도형이름 출력하는 기능을 갖고 있다.
}
class Line extends ShapeAbst{
	@Override
	public void draw() {		
		System.out.println("Line");
	}	
}
class Rect extends ShapeAbst{
	@Override
	public void draw() {		
		System.out.println("Rect");
	}	
}
class Circle extends ShapeAbst{
	@Override
	public void draw() {		
		System.out.println("Circle");
	}	
}
class GraphicEditor{
	private ShapeAbst startShape;
	private ShapeAbst lastShape,obj;
	Scanner sc = new Scanner(System.in);
	int count=0;
	void run() {
		int sel=0;		
		while(sel!=4) {
			System.out.print("1.삽입  2.삭제  3.모두보기  4.종료 >>");
			sel=Integer.parseInt(sc.nextLine());
			if(sel==1) 	add();	
			else if(sel==2) del();	
			else if(sel==3) 	find();	
			else if(sel==4) {
				System.out.println("에디터를 종료합니다.");
				sc.close();
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	private void add() {		
		System.out.print("1.Line  2.Rect  3.Circle >>");
		int num = Integer.parseInt(sc.nextLine());
		if(startShape==null) {// 시작하는 리스트가 없는 경우에는 startShape에 새로운 객체를 연결을 해서 진행을 한다
			if(num==1) {
				startShape=new Line();
				lastShape=startShape;
			}
			else if(num==2) {
				startShape=new Rect();
				lastShape=startShape;
			}
			else if(num==3) {
				startShape=new Circle();
				lastShape=startShape;
			}
			else {
				System.out.println("잘못된 번호 입력. 다시 눌러 주세요");
				add();
			}	
		}
		else {
			if(num==1) {
				obj = new Line();
				lastShape.setNext(obj);
				lastShape=obj;				
			}

			else if(num==2) {
				obj = new Rect();						
				lastShape.setNext(obj);
				lastShape=obj;				
			}
			else if(num==3) {
				obj = new Circle();				
				lastShape.setNext(obj);
				lastShape=obj;				
			}
			else {
				System.out.println("잘못 입력했습니다.");
				add();
			}

		}
		count++;
	}
	private void del() {		
		System.out.print("삭제할 도형의 위치 >>");
		int num = Integer.parseInt(sc.nextLine());
		ShapeAbst s = startShape;
		if(count<=0) {
			System.out.println("삭제할 수 없습니다.");
		}
		else if(count>=num) { 
			if(num==1) {// 처음 리스트 삭제시				
				ShapeAbst tmp = startShape.getNext();
				startShape=tmp;
				count--;
				return;				
			}
			else if(count==num) { // 마지막 저장되어 있는 리스트 삭제 시
				for(int i=2;i<num;i++)
					s=s.getNext();
				lastShape=s;
				s.setNext(null);
				count--;
			}
			else {
				for(int i=2;i<num;i++) { // 중간에 저장되어 있는 리스트 삭제시
					s=s.getNext();
				}
				ShapeAbst tmp = s.getNext(); // 삭제하고자 하는 배열의 주소값을 가르킴
				s.setNext(tmp.getNext());
				count--;
			}
		}
		else {
			System.out.println("삭제할 수 없습니다.");
		}		
	}
	private void find() {
		if(startShape==null) System.out.println("리스트가 비어 있습니다.");
		else {
			ShapeAbst s = startShape;
			while(s!=null) {
				s.draw();
				s=s.getNext();
			}
		}
	}
}

public class ClassTest71Ex {
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.run();
	}
}
