package java0828;

interface MyInter{
	void func();
}

public class AnonyEx01 {
	public static void main(String[] args) {
		new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter�� func() �������̵�");
			}
		}.func();
	}
}
