package java0821;


public class ClassEx16 {
	double d;
	//������ : �޸� �������� �ʴ´�.
	//		    �޸𸮸� �����ϴ� ���� ������ �޼���
	//		    �����ڱ��� ��ġ�� ��ǰ�� ��ν� ������ ����
	ClassEx16(){
		d= Math.random();
	}
	ClassEx16(double d){
		this.d= d;
	}
	public static void main(String[] args) {	
		ClassEx16 c1 = new ClassEx16();
		System.out.println(c1.d);
		ClassEx16 c2 = new ClassEx16(12.5);
		System.out.println(c2.d);
		ClassEx16 c3 = new ClassEx16(3);
		System.out.println(c3.d);
	}
}
