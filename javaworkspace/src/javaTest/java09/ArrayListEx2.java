package javaTest.java09;
import java.util.*; 
class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	//������������ ���̳θ� ���� ���ִ�. 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); //.������ ����ڰ� �ִ��� 
		List list = new ArrayList(length/LIMIT + 10); //���������·� ��̸���Ʈ�� ����Ʈ���ִ°� �������̵��ϴ¤� �ä� 
		for(int i=0; i < length; i+=LIMIT) { //ũ�⸸ŭ �ݺ��� �Ѵ�. 1���̾ƴ϶� ���Ը�ŭ�̶� 10�� ���� 
			if(i+LIMIT < length ) // I+���� = 10  
				list.add(source.substring(i, i+LIMIT)); //0-9���� �ڸ���. �������� ���ԾȈ� 
			else 
				list.add(source.substring(i)); //�����ִ� �κ��� ������
		} 

		for(int i=0; i < list.size(); i++) { //�����ŭ �ݺ��ϰ�
			System.out.println(list.get(i)); //������
		} 
	} // main()
} 

//��Ʈ���� �̿��ؼ� 10���� ��� �Ѵ�. 