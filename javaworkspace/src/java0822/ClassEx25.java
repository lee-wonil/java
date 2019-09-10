package java0822;
import java.util.Scanner;
//book클래스를 활용하여 3개짜리 Book 객체배열을 만들고,
//사용자로 부터 책의 제목과 저자를 입력받아 배열을 완성하고 출력해 보세요.
class Book{
	String author;
	String title;
	Book(String author, String title){
		this.author=author;
		this.title=title;
	}
	@Override
	public String toString() { // toString 재정의
		return "책 제목: "+author+" 책 저자: "+title;
	}
}

public class ClassEx25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[3];
		for(int i=0;i<b.length;i++) {
			System.out.print((i+1)+"번째 책 제목을 입력하세요>>");
			String title = sc.nextLine();
			System.out.print("해당 책 저자를 입력하세요>>");
			String author = sc.nextLine();
			b[i]=new Book(title,author);
		}
		for(Book b1 : b) {
			System.out.println(b1);
		}
		sc.close();
			
	}
}
