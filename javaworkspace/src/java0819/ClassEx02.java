package java0819;
//#1.Ŭ���� ����� : Ʋ�� �����.
class Person{
	//���� : �Ӽ� : ���
	String name="";
	int age=0;
	//�޼��� : ��� : ����
	void walk() {
		System.out.println("�ɾ��");
	}
	void eat() {
		System.out.println("����");
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	
}

public class ClassEx02 {

	//�޼��� : ���θ޼��� : ���α׷������ ���� ���� ����Ǵ� �޼���
	//		->�� �۾� ���� �����, ��ü �����ϰ� ����� Ȯ���غ����� 
	//			���θ޼��� �ȿ��� ������ �Ѵ�.
	public static void main(String[] args) {
		//#2. ��ü ���� : ���α׷������ �ڵ�ȣ��Ǿ� �����ϴ� main�޼ҵ忡�ٰ� ��ü �����ϱ�.		
		Person p1 = new Person();
		//#3. ���		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.name="ȫ�浿";
		p1.age=10;
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);		
		p1.walk();
		p1.eat();
	}

}
