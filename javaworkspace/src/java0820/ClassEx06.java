package java0820;
class Tv1{
	// �ν��Ͻ� ����
	boolean power=false;
	int ch=1,vol=0;
	
	// �ν��Ͻ� �޼���
	void power() {
		power = !power;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	//volDown(),chUp(),chDown();
	
}


public class ClassEx06 {

	public static void main(String[] args) {
		Tv1 t= new Tv1();
		System.out.println(t.power);
		t.power();
		System.out.println(t.power);
		t.chUp();
		System.out.println(t.ch);
		t.chDown();
		System.out.println(t.ch);
		
		//return;
	}

}
