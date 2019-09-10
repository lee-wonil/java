package java0828;

class Person{
	void wake() {
		System.out.println("7�ÿ� ���");
	}
}
class Anony{
	
	// ������ �ʱⰪ���� ����
	Person p = new Person() {
		void work() {
			System.out.println("���");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� ���");
			work();
		}
	};
	// �������� ������ ����
	void func() {
		Person localP = new Person() {
			void walk() {
				System.out.println("��å");
			}
			@Override
			void wake() {
				System.out.println("7�� �ݿ� ���");
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
		//�͸�ü �Ű��� ���
		anony.func2(new Person() {
			void study() {
				System.out.println("�����Ѵ�!!!");
			}
			@Override
			void wake() {
				System.out.println("8�ÿ� ���");
				study();
			}
		});
	
	}
}
