package java0902;

public class WrapperEx04 {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'f';
		if(Character.isDigit(c1))System.out.println(c1+"�� ����");
		if(Character.isAlphabetic(c2))System.out.println(c2+"�� ���ĺ�");
		
		//�ڽ� ��ڽ�
		int n = 10;
		Integer intObj = n;				//�ڽ�(�⺻��-> ��ü��)
		System.out.println(intObj);
		
		int m = intObj+10;				// ��ڽ�(��ü�� -> �⺻��)
		System.out.println(m);
	}
}
