package java0822;

class Person{
	private String name;
	private int age;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class ClassEx28 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("ÇÇÄ«Ãò");
		System.out.println(p1.getName());
		p1.setAge(10);
		System.out.println(p1.getAge());
		System.out.println(p1);
	}
}
