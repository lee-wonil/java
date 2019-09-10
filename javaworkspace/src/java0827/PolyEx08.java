package java0827;
//매개변수의 다형성
class Product{
	int price;			//제품의 가격
	int bonusPoint;		//제품 구매시 제공하는 보너스 점수
	
	Product(int price){//제품생산할때 가격부여하고 생산
		this.price = price;
		bonusPoint = (int)(price/10.0);		//보너스 포인트는 제품가격의 10%
	}
}
class Tv extends Product{//price, bonusPoint

	Tv(){
		super(100);
	}
	Tv(int price){
		super(price);	// 부모클래스의 생성자 Product(int price)를 호출
						// 부모클래스의 기본생성자가 자동으로 생성안되며,
						// 개발자가 기본생성자를 만들어 놓지 않은 이유는
						// 개발자의 의도는 가격없이는 제품생산을 하지 못하게 만들려고
	}
	@Override
	public String toString() {
		return "Tv";
	}
	
	
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
	
}
class Buyer{	// 고객 클래스 , 물건 사는 사람
	int money=1000;		//고객 소유돈
	int bounsPoint = 0;	//실제 고객이 갖고 있는 보너스 포인트
	
	void buy(Product p) {	//매개변수의 다형성
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price;				// 고객 돈에서 구매한 제품 가격 차감
		bounsPoint+=p.bonusPoint;	// 고객 포인트 적립
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
}
public class PolyEx08 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		// Object 클래스의 toString()메소드는 tv.getClass().getName()+"@"+(16진수)tv.hashCode()를 리턴한다
		// toString 메소드를 재정의 하여 원하는 문구를 출력할 수 있게 한다.
		b.buy(tv);
		System.out.println("현재 잔액 :"+b.money+" 현재 포인트"+b.bounsPoint);
		b.buy(com);
		System.out.println("현재 잔액 :"+b.money+" 현재 포인트"+b.bounsPoint);

	}
}
