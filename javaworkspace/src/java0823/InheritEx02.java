package java0823;
class Pen{
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
}
class SharpPencil extends Pen{
	private int width;	
}
class BallPen extends Pen{	
	private String color;
	public String getColor() {return color;	}
	public void setColor(String color) {this.color=color;}
}
class FountainPen extends BallPen{	
	public void refill(int n) {setAmount(n);}
}

public class InheritEx02 {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.setAmount(20);
		SharpPencil sp = new SharpPencil();
		sp.setAmount(20);
		BallPen b = new BallPen();
		b.setAmount(20);
		System.out.println(b.getAmount());
	}

}
