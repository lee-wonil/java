package java0828;

import java.util.Scanner;

// �߻�Ŭ����
/*
	�ؽ�Ʈ�� ������ϴ� ������ �׷��� ������ �����. 
	�Ʒ� �߻�Ŭ���� ShapeAbst�� ��ӹ��� Line, Rect, Circle Ŭ������ �����, 
	���� ����ó�� "����", "����", "��κ���", "����"�� 4���� �׷��� ���� ����� ���� 
	Ŭ���� GraphicEditor�� �ۼ��ϼ���.
	���࿹�� : 
		�׷��� �����͸� �����մϴ�. ���ϴ� ����� ��ȣ�� �����ּ���.
		1.����  2.����  3.��κ���  4.���� >>  1 (����� �Է�)
		1.Line  2.Rect  3.Circle >>  2
		1.����  2.����  3.��κ���  4.���� >>  1
		1.Line  2.Rect  3.Circle >>  3
		1.����  2.����  3.��κ���  4.���� >>  3
		Rect
		Circle
		1.����  2.����  3.��κ���  4.���� >>  2
		������ ������ ��ġ >> 3
		������ �� �����ϴ�.
		1.����  2.����  3.��κ���  4.���� >>  4
		�����͸� �����մϴ�.
 */
abstract class ShapeAbst {
	private ShapeAbst next;
	public ShapeAbst() { next = null; }
	public void setNext(ShapeAbst obj) { next = obj; }	// ��ũ ����
	public ShapeAbst getNext() { return next; }
	abstract public void draw();						// �߻�޼��� : �����̸� ����ϴ� ����� ���� �ִ�.
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
			System.out.print("1.����  2.����  3.��κ���  4.���� >>");
			sel=Integer.parseInt(sc.nextLine());
			if(sel==1) 	add();	
			else if(sel==2) del();	
			else if(sel==3) 	find();	
			else if(sel==4) {
				System.out.println("�����͸� �����մϴ�.");
				sc.close();
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	private void add() {		
		System.out.print("1.Line  2.Rect  3.Circle >>");
		int num = Integer.parseInt(sc.nextLine());
		if(startShape==null) {// �����ϴ� ����Ʈ�� ���� ��쿡�� startShape�� ���ο� ��ü�� ������ �ؼ� ������ �Ѵ�
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
				System.out.println("�߸��� ��ȣ �Է�. �ٽ� ���� �ּ���");
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
				System.out.println("�߸� �Է��߽��ϴ�.");
				add();
			}

		}
		count++;
	}
	private void del() {		
		System.out.print("������ ������ ��ġ >>");
		int num = Integer.parseInt(sc.nextLine());
		ShapeAbst s = startShape;
		if(count<=0) {
			System.out.println("������ �� �����ϴ�.");
		}
		else if(count>=num) { 
			if(num==1) {// ó�� ����Ʈ ������				
				ShapeAbst tmp = startShape.getNext();
				startShape=tmp;
				count--;
				return;				
			}
			else if(count==num) { // ������ ����Ǿ� �ִ� ����Ʈ ���� ��
				for(int i=2;i<num;i++)
					s=s.getNext();
				lastShape=s;
				s.setNext(null);
				count--;
			}
			else {
				for(int i=2;i<num;i++) { // �߰��� ����Ǿ� �ִ� ����Ʈ ������
					s=s.getNext();
				}
				ShapeAbst tmp = s.getNext(); // �����ϰ��� �ϴ� �迭�� �ּҰ��� ����Ŵ
				s.setNext(tmp.getNext());
				count--;
			}
		}
		else {
			System.out.println("������ �� �����ϴ�.");
		}		
	}
	private void find() {
		if(startShape==null) System.out.println("����Ʈ�� ��� �ֽ��ϴ�.");
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
