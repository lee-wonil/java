package editplus;

class Test03 {
	public static void main(String[] args){
		//�ڵ� �ۼ�
		char ch ='\u0041';
		System.out.println(ch);//��¹�
		//ù���ڰ� �빮�ڷ� �����ϸ� Ŭ������.
		//�ҹ��� �ڿ�() �Ұ�ȣ�� �پ������� �޼ҵ��.

		long l = 100L;
		System.out.println(l);

		float f = 3.14f;
		System.out.println(f);

		//�����÷ο�
		byte b= (byte)200;
		System.out.println(b);

		//int : 10���� / 8���� : 0���� �����ϴ¼� / 16���� : 0x�� �����ϴ� �� / 2���� : 0b�� �����ϴ� ��
		int i=15;
		int j =015;
		int k = 0x15;
		int m = 0b01010;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);

		String str = "�ȳ��ϼ���";
		System.out.println(str);
		String name = "�̿���";
		System.out.println(name);
		//String s = 'A'; ���ڿ��� ��� ""�� ����� �ȴ�.
		String s= "A";
		System.out.println(s);

	}//main
}//class
