package java0822;

class Person1{
	private int age =10;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0&&age<160)
			this.age = age;
		else
			System.out.println("�������� ���� ���̸� �Է��߽��ϴ�. ���� ����� ���̴� "+getAge()+"�� ������ ���� ����");
	}
	
}

public class ClassEx29 {

	public static void main(String[] args) {
		Person1 p = new Person1();
//		p.age=1000//age�� private �̹Ƿ� ���ٺҰ�
		p.setAge(1000);
		System.out.println(p.getAge());
	}

}
