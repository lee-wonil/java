package javaTest.java06;
class Car2 {
	String color;
	int door;

	void drive() { 		// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {		// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine2 extends Car2 {	// �ҹ���
	void water() {		// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}
class CastingTest2 {
	public static void main(String args[]) {
		Car2 car = new Car2();
		Car2 car2 = null;
		FireEngine2 fe = null;
  
		car.drive();
		fe = (FireEngine2)car2;	
		fe.drive();
		car2 = (Car2)fe;
		car2.drive();


	}
}