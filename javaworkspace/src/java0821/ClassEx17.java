package java0821;
// ����� ���ڸ� ��Ÿ���� title�� author �ʵ带 ���� BookŬ������ �ۼ��ϰ�
// �����ڸ� �ۼ��Ͽ� �ʵ带 �ʱ�ȭ �غ���.
class Book{
	//�ν��Ͻ� ����
	String title;
	String author;
	Book(String title){
		this.title=title;
		author="���ڹ̻�";
	}
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return "���� : "+title+" �۰� : "+author;		
	}
}
public class ClassEx17 {
	public static void main(String[] args) {
		
		Book b = new Book("��������");
		Book b2 = new Book("�����","����������");
		System.out.println(b);
		System.out.println(b2);
	}
}
