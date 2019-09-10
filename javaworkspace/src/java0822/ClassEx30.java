package java0822;
/*
  	Static ���:
  		Ŭ���� ��� (Ŭ���� ����, Ŭ���� �޼���) ���鶧 ���Ǵ� Ű����
  		�������� ����ϰ� ������ �����ִ� Ű����.
  		���ٹ�� : Ŭ������.������/ Ŭ������.�޼����()
  		
  		static �޼���� ��ü �������� �ٷ� �̿��� �� �ִ�.
  		--->static �޼���� static ����� �����Ҽ� �ִ�.
  		--->static �޼���� this�� ����Ҽ� ����.
 */
class Calc{
	// ���������� X == default, static == Ŭ���� �޼���(����޼���) -> ��ü �������� ���
	public static int sum(int a,int b) { return a + b ;}
	public static int mul(int a,int b) { return a * b ;}
	public static int abs(int a) { return a>0?a:-a  ;} //���밪 ���ϱ�
	void showDefault() {
		System.out.println("default �޼���");
	}
	static void showStaticDefault() {
		//showDefault(); //static�� instance�� ���� �Ұ���	.��ü �����Ŀ� �ν��Ͻ� ��밡��	
		System.out.println(sum(10,20));//static�� static�� ���ٰ���
	}
}

public class ClassEx30 {
	public static void main(String[] args) {
		System.out.println(Calc.sum(10, 20));
		System.out.println(Calc.mul(10, 20));
		System.out.println(Calc.abs(-20));
	}

}
