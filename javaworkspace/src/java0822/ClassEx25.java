package java0822;
import java.util.Scanner;
//bookŬ������ Ȱ���Ͽ� 3��¥�� Book ��ü�迭�� �����,
//����ڷ� ���� å�� ����� ���ڸ� �Է¹޾� �迭�� �ϼ��ϰ� ����� ������.
class Book{
	String author;
	String title;
	Book(String author, String title){
		this.author=author;
		this.title=title;
	}
	@Override
	public String toString() { // toString ������
		return "å ����: "+author+" å ����: "+title;
	}
}

public class ClassEx25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[3];
		for(int i=0;i<b.length;i++) {
			System.out.print((i+1)+"��° å ������ �Է��ϼ���>>");
			String title = sc.nextLine();
			System.out.print("�ش� å ���ڸ� �Է��ϼ���>>");
			String author = sc.nextLine();
			b[i]=new Book(title,author);
		}
		for(Book b1 : b) {
			System.out.println(b1);
		}
		sc.close();
			
	}
}
