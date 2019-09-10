package java0821;
class Book3{
	String title = "";
	String author = "";
	Book3(){
		//System.out.println("기본생성자 호출");
		this("무제","작자미상");
	}
	Book3(String title){
		//this.title = title;
		this(title,"작자미상");
	}
	Book3(String title, String author){
		this.author=author;
		this.title=title;
	}
	void show() {
		System.out.println(title+" "+author);
	}
}

public class ClassEx23 {
	public static void main(String[] args) {
		Book3 b = new Book3("홍길동전");
		b.show();
	}
}
