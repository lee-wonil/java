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
			System.out.println("적절하지 않은 나이를 입력했습니다. 현재 당신의 나이는 "+getAge()+"로 변경이 되지 않음");
	}
	
}

public class ClassEx29 {

	public static void main(String[] args) {
		Person1 p = new Person1();
//		p.age=1000//age가 private 이므로 접근불가
		p.setAge(1000);
		System.out.println(p.getAge());
	}

}
