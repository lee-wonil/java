
package java0819;
//#1. Ŭ���� ���� : TV
class Tv{
	boolean power=false;
	int vol=0,ch=1;
	
	
}

public class ClassEx03 {
	public static void main(String[] args) {
		//#2. ��ü(�ν��Ͻ�) ���� : �޸𸮿� �ø���
		Tv t; // ����
		t= new Tv();// ����
		/*
		System.out.println(t);
		System.out.println(t.ch);
		System.out.println(t.power);
		System.out.println(t.vol);
		*/
		//��ü ������ �����
		Tv t1=new Tv();
		Tv t2=new Tv();
		Tv t3=new Tv();
		Tv t4=new Tv();
		// ��ü���� ���� ���� ������ �����
		t1.ch=10;
		t2.ch=20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		/*
		// �޸� ��ü
		t=null;
		t1=null;
		t2=null;
		t3=null;
		t4=null;
		*/
		//����(���� Ÿ��)
		t1=t2;
		t2=t1;
		
		//�Ұ���(�ٸ� Ÿ��)
		//t1=t2.ch;
		
		//���θ޼��带 �����ϴ� ClassEx03���� Ŭ���� �̹Ƿ� ��ü����������
		ClassEx03 cls = new ClassEx03();
		String str = new String();

	}

}


