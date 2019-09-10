package java0827;
//�Ű������� ������
class Product{
	int price;			//��ǰ�� ����
	int bonusPoint;		//��ǰ ���Ž� �����ϴ� ���ʽ� ����
	
	Product(int price){//��ǰ�����Ҷ� ���ݺο��ϰ� ����
		this.price = price;
		bonusPoint = (int)(price/10.0);		//���ʽ� ����Ʈ�� ��ǰ������ 10%
	}
}
class Tv extends Product{//price, bonusPoint

	Tv(){
		super(100);
	}
	Tv(int price){
		super(price);	// �θ�Ŭ������ ������ Product(int price)�� ȣ��
						// �θ�Ŭ������ �⺻�����ڰ� �ڵ����� �����ȵǸ�,
						// �����ڰ� �⺻�����ڸ� ����� ���� ���� ������
						// �������� �ǵ��� ���ݾ��̴� ��ǰ������ ���� ���ϰ� �������
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
class Buyer{	// �� Ŭ���� , ���� ��� ���
	int money=1000;		//�� ������
	int bounsPoint = 0;	//���� ���� ���� �ִ� ���ʽ� ����Ʈ
	
	void buy(Product p) {	//�Ű������� ������
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money-=p.price;				// �� ������ ������ ��ǰ ���� ����
		bounsPoint+=p.bonusPoint;	// �� ����Ʈ ����
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
}
public class PolyEx08 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		// Object Ŭ������ toString()�޼ҵ�� tv.getClass().getName()+"@"+(16����)tv.hashCode()�� �����Ѵ�
		// toString �޼ҵ带 ������ �Ͽ� ���ϴ� ������ ����� �� �ְ� �Ѵ�.
		b.buy(tv);
		System.out.println("���� �ܾ� :"+b.money+" ���� ����Ʈ"+b.bounsPoint);
		b.buy(com);
		System.out.println("���� �ܾ� :"+b.money+" ���� ����Ʈ"+b.bounsPoint);

	}
}
