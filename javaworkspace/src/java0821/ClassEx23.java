package java0821;
class Book3{
	String title = "";
	String author = "";
	Book3(){
		//System.out.println("�⺻������ ȣ��");
		this("����","���ڹ̻�");
	}
	Book3(String title){
		//this.title = title;
		this(title,"���ڹ̻�");
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
		Book3 b = new Book3("ȫ�浿��");
		b.show();
	}
}
