package java0822;
//��ü �迭
class Car{
	String color="";
	Car(String color){
		this.color=color;
	}
	String drive() {
		return color+"���� ���� �������ϴ�.";
	}
}
public class ClassEx24 {
	public static void main(String[] args) {
		Car[] cars=new Car[5];
		String [] colors={"����","���","����","�ʷ�","�Ķ�"};
		for(int i=0;i<cars.length;i++) {
			cars[i]=new Car(colors[i]);
		}
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].drive());
			System.out.println(cars[i]);
		}
	}
}
