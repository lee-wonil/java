package editplus;

class  Test04{
	public static void main(String[] args) 	{
		//��¹� ����
		System.out.println(10+3);
		System.out.println("a"+"b"+"c");
		System.out.println("A"+10);
		System.out.println('A'+10);//A=65
		//'0' = 48, 'A' =65, 'a'=97

		//�̽������� ����
		System.out.print("�ȳ�\t��\"����\n");
		System.out.print("��\\����\n");

		//printf()
		int a = 10;
		int b = 100;
		System.out.printf("%d %d \n",a,b);
		char ch = 'A';
		System.out.printf("%c \n",ch);
		// System.out.printf("%d \n",ch);  �Ұ�

		String str = "hello";
		System.out.printf("%s \n",str);
		double d =3.1415;
		System.out.printf("%f \n",d); // "%.2f"�� ��� �Ҽ��� 2��° �ڸ����� ���


	}
}
