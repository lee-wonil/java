package javaTest.java03;

class FlowEx24 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++){
			if(i%3==0)
				continue; //3���� ������ �������� �ݺ��������� ���� �ٽ� �ݺ��� ���۵ȴ�.
			System.out.println(i);
		}
	}
}
