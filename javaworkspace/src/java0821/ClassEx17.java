package java0821;
// 제목과 저자를 나타내는 title과 author 필드를 가진 Book클래스를 작성하고
// 생성자를 작성하여 필드를 초기화 해보자.
class Book{
	//인스턴스 변수
	String title;
	String author;
	Book(String title){
		this.title=title;
		author="작자미상";
	}
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return "제목 : "+title+" 작가 : "+author;		
	}
}
public class ClassEx17 {
	public static void main(String[] args) {
		
		Book b = new Book("콩쥐팥쥐");
		Book b2 = new Book("어린왕자","생텍지베리");
		System.out.println(b);
		System.out.println(b2);
	}
}
