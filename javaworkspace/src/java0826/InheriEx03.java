package java0826;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	//�ڹ��� ĸ��ȭ(private ����+ get/set �޼���)
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", age=" + age + ", height=" + height + ", name=" + name + "]";
	}
}

class Student extends Person{
	
	public void set() {
		age=30;
		name = "ȫ�浿";
		height=170;
		//weight=50;
		setWeight(50);
		System.out.println(getWeight());
	}
}

public class InheriEx03 {

	public static void main(String[] args) {
		Student s = new Student(); 
		s.set();
		System.out.println(s);
		
	}

}
