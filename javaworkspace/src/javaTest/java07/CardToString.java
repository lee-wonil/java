package javaTest.java07;
class Card
{
	String kind;
	int number;

	Card(){
		this("SPACD",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
class CardToString
{
	public static void main(String[] args) 
	{
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

//toString �������̵� ���� �ʾұ⶧���� hashCode ��Ÿ����.
//Object �� toString() �� ȣ��ȴ�.