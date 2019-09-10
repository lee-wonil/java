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

//toString 오버라이딩 하지 않았기때문에 hashCode 나타난다.
//Object 의 toString() 이 호출된다.