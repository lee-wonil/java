package javaTest.java02;

class  OperatorEx13
{
	public static void main(String[] args) 
	{
		char c1 = 'a';  //c1 ���� ���� 'a'�� �ڵ尪�� 97�� ����ȴ�
		char c2 = c1;	
		char c3 = ' ';
		
		int i = c1 + 1; //�ڵ尪�� ��ȯ�Ǿ� int ���̵Ǵ°��̴�. 97+1 ������.
		
		c3 = (char)(c1+1); //���������� int ���̹Ƿ� char������ ����ȯ�� �ʿ��ϴ�.
		c2++; //c2�� ����� c1 ���� 2�������Ͽ� 'c'��µȴ�. 
		c2++;
		i =' ';
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}
}
