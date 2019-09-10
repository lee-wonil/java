package java0821;
// String 타입의 title과 author멤버를 가지고 있는 Book2 클래스를 만들고
// 저자만 입력받는 생성자, 저자와 제목을 입력받는 생성자, 기본생성자 이렇게 3개를 만들어 보세요.
// show()라는 메서드도 추가해서 책 제목과, 저자를 출력하게 하세요
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
		System.out.println("책 제목 : "+title+" 저자 : "+author);
	}
}

public class ClassEx22 {
	public static void main(String[] args) {
		Book2 b = new Book2();
		Book2 b1 = new Book2("홍길동전");
		Book2 b2 = new Book2("홍길동전","허균");
		b.show();
		b1.show();
		b2.show();
	}
}
