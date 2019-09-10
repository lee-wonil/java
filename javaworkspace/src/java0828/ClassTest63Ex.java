package java0828;
import java.util.Scanner;

// �߻�Ŭ����

/*
	#1. ConverterŬ������ ��ӹ޾� ��ȭ�� �޷��� ��ȯ�ϴ� Won2Dollar Ŭ������ �ۼ��ϼ���. 
		main()�޼ҵ��� #1�� �ڵ�� �Ʒ� �ܼ� ��¿��� �����ϼ���. 
		�ܼ���¿�)
			���� �޶�� �ٲߴϴ�.
			���� �Է��ϼ���>>  24000 (<-����ڰ� �� �Է�)
			��ȯ���: 20.0�޷� �Դϴ�
			
	#2. Converter Ŭ������ ��ӹ޾� Km�� Mile(����)�� ��ȯ�ϴ� Km2Mile Ŭ������ �ۼ��ϼ���. 
		main()�޼ҵ� #2�� �ڵ�� �Ʒ� �ܼ� ��¿��� �����ϼ���.
		�ܼ���¿�)
			Km�� mile�� �ٲߴϴ�.
			Km�� �Է��ϼ���>>  30(<-����ڰ� �� �Է�)
			��ȯ���: 18.75mile�Դϴ�
*/

abstract class Converter {
	abstract protected double convert(double src);	// �߻�޼ҵ�
	abstract protected String getSrcString();			// �߻�޼ҵ�
	abstract protected String getDestString();			// �߻�޼ҵ�
	protected double ratio;							// ����
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� "+getDestString()+ "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: "+res+getDestString()+"�Դϴ�");
		//scanner.close();	// 2�� ���� ����� ��ü�� �ݾ����� ���� ��ĳ�� ��ü�� ���� ���� �Է��� ���� �� ����� �Ұ����� �ּ�ó��
	}
}
class Won2Dollar extends Converter{

	Won2Dollar(double ratio){
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "��";
	}

	@Override
	protected String getDestString() {
		return "�޷�";
	}
	
}
class Km2Mile extends Converter{
	Km2Mile(double ratio){
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
	
}

public class ClassTest63Ex {
	public static void main(String[] args) {
		//#1.
		Won2Dollar toDollar = new Won2Dollar(1200);		// 1�޷��� 1200��
		toDollar.run();
		
		//#2. 
		Km2Mile toMile = new Km2Mile(1.6);			// 1������ 1.6km
		toMile.run();
	}
}
