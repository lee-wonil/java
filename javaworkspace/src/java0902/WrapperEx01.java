package java0902;


public class WrapperEx01 {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Double d = new Double(3.14);
		Boolean b= new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);
		
		// Character �� ������ ������ Wrapper Ŭ������ ���
		// ���ڿ��� Wrapper ��ü�� ������ �� �ִ�.
		
		//Float ��ü�� double Ÿ���� ������ ���� ����
		Float f = new Float((double)3.14);
	}
}
