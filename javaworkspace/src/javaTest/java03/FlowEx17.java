package javaTest.java03;

class  FlowEx17
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0;i<1000000000;i++){
			;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("���۽ð� : "+startTime);
		System.out.println("����ð� : "+endTime);
		System.out.println("�ҿ�ð� : "+(endTime - startTime));
	}
}
/*
	currentTimeMillie() �� 1970�� 1�� 1�Ϻ��� ��������� �ð��� õ���� ���ʷ� ����� ����� long���� ������ ��ȯ�ϴ� �޼��� �̴�.
	for������ ��{}�� �ƹ��� �۾��� �����ʴ� ����(;)�� ������� ������ ���ǽ��� (i < 100000000)�� ������(i++)�� 10�� ���� 
	�ݺ�ó�� �ϴµ� �ɸ��ð� �̴�. (�� 1.5��)
*/