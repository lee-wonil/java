package java0828;

import java.util.Scanner;

// �߻� Ŭ���� 
/*
	�Ʒ��� ���� 3���� �ʵ�� �޼ҵ带 ���� 4���� Ŭ���� Add,Sub,Mul,Div �� �ۼ��ϼ���. 
	- intŸ���� a, b �ʵ� : 2���� �ǿ����� ������ ����
	- void setValue(int a, int b) : �ǿ����� ���� ��ü ���� ����
	- int calculate() : Ŭ������ ������ �´� ������ �����ϰ� ����� �����Ѵ�.
	�׷���, ������ Ŭ�������� ����� �ʵ�� �޼ҵ尡 �����ϴ� �����̹Ƿ�, 
	Calc��� �̸��� �߻�Ŭ������ �ۼ��Ͽ� Calc�� ��ӹ޾� �� 4���� Ŭ������ �ۼ��غ�����.
	�׸���, main()�޼ҵ忡�� ���࿹�ÿ� ���� 2���� ������ �����ڸ� �Է¹��� ��,
	4���� Ŭ������ ������ ������ ó���� �� �ִ� ��ü�� �����ϰ� �޼��� ȣ���Ͽ� �� ��� ���� ȭ�鿡 ����ϰ� �ۼ� �غ�����. 
	���� ���� :
		�� ������ �����ڸ� �Է��ϼ��� >> 5 7 +
		12
*/
abstract class Calc{
	protected int a, b;
	void setValue(int a,int b) {	// �߻�޼ҵ�� ���� �ʿ� ���� ������ �׳� ����
		this.a=a;
		this.b=b;
	}
	abstract protected int calculate();	//�߻�޼ҵ�
}
class Add extends Calc{	
	@Override
	protected int calculate() {
		return a+b;
	}	
}
class Sub extends Calc{
	@Override
	protected int calculate() {
		return a-b;
	}	
}
class Mul extends Calc{
	@Override
	protected int calculate() {
		return a*b;
	}	
}
class Div extends Calc{
	@Override
	protected int calculate() {
		return a/b;
	}	
}
public class ClassTest70Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cal;	// ������ ����� ���ؼ� calc ���
		System.out.println("�� ������ �����ڸ� �Է��ϼ��� >>");
		String str = sc.nextLine();
		String []strs = str.split(" "); // ���� �������� ���ڿ��� �ɰ���.
			
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		
		char c = strs[2].charAt(0);
		if(c=='+') {
			cal=new Add();		// ������
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='-') {
			cal=new Sub();		// ������
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='*') {
			cal=new Mul();		// ������
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else if(c=='/') {
			cal=new Div();		// ������
			cal.setValue(a, b);
			System.out.println(cal.calculate());
		}
		else {
			System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
		}
		sc.close();
	}
}
