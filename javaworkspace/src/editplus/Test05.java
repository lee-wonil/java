package editplus;

class Test05{
	public static void main(String[] args){
		//����1. ������ ���� a�� b�� ���� 10,20�� �����ؼ� �����, ���� ���� ��ȯ�ؼ� ����غ�����.
		int a =10,b=20 ; //���� a, b����� �� ����

		System.out.println(a+" "+b); // ���

		//������ ���� ���� ��ȯ�ϴ� ������ �ۼ�
		int temp=a; // �ӽ� ���� temp�� a�� ���� ����
		a=b; // b�� ����Ǿ� �ִ� ���� a�� ����
		b=temp; // temp�� ����Ǿ� �ִ� a�� ���� b�� ������

		System.out.println(a+" "+b); // ���

		//����2. ���� ���� ����� (�̸�, ��ȭ��ȣ, �̸��� ���)
		String name="�̿���"; // �̸� ����
		String pnum="010-9338-8782";// ��ȭ��ȣ ����
		String email="wonil0304@gmail.com"; // �̸��� ����
		System.out.println("---------------------");
		System.out.println("�̸�\t : " +name);
		System.out.println("��ȭ��ȣ : " +pnum);
		System.out.println("�̸���\t : "+email);
		System.out.println("---------------------");
	}
}
