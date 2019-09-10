package java0828;

class Person{
	void wake() {
		System.out.println("7시에 기상");
	}
}
class Anony{
	
	// 변수의 초기값으로 대입
	Person p = new Person() {
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시에 기상");
			work();
		}
	};
	// 지역변수 값으로 대입
	void func() {
		Person localP = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시 반에 기상");
				walk();
			}
		};
		localP.wake();
	}
	void func2(Person p) {
		p.wake();
	}
}

public class AnonyEx02 {
	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.p.wake();
		anony.func();
		//익명객체 매개값 사용
		anony.func2(new Person() {
			void study() {
				System.out.println("공부한다!!!");
			}
			@Override
			void wake() {
				System.out.println("8시에 기상");
				study();
			}
		});
	
	}
}
