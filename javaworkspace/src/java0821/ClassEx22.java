package java0821;
// String Ÿ���� title�� author����� ������ �ִ� Book2 Ŭ������ �����
// ���ڸ� �Է¹޴� ������, ���ڿ� ������ �Է¹޴� ������, �⺻������ �̷��� 3���� ����� ������.
// show()��� �޼��嵵 �߰��ؼ� å �����, ���ڸ� ����ϰ� �ϼ���
class Book2{
	String title;
	String author;
	Book2(){
		title=" ";
		author=" ";		
	}
	Book2(String title){
		this.title=title;
		author=" ";
	}
	Book2(String title,String author){
		this.title=title;
		this.author=author;
	}
	void show() {
		System.out.println("å ���� : "+title+" ���� : "+author);
	}
}

public class ClassEx22 {
	public static void main(String[] args) {
		Book2 b = new Book2();
		Book2 b1 = new Book2("ȫ�浿��");
		Book2 b2 = new Book2("ȫ�浿��","���");
		b.show();
		b1.show();
		b2.show();
	}
}
