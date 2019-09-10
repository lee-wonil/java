package java0822;
//객체 배열
class Car{
	String color="";
	Car(String color){
		this.color=color;
	}
	String drive() {
		return color+"색의 차가 지나갑니다.";
	}
}
public class ClassEx24 {
	public static void main(String[] args) {
		Car[] cars=new Car[5];
		String [] colors={"빨간","노란","검정","초록","파란"};
		for(int i=0;i<cars.length;i++) {
			cars[i]=new Car(colors[i]);
		}
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].drive());
			System.out.println(cars[i]);
		}
	}
}
