package javaTest.java07;
class Card2
{
	String kind;
	int number;

	Card2(){
		this("SPADE",1);
	}
	Card2(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString(){
		return "kind :"+kind+", number :"+number;
	}
}
class CardToString2
{
	public static void main(String[] args) 
	{
		Card2 c = new Card2("HEART",10);
		System.out.println(c.toString());
	}
}


//Object 클래스에 정의된 toString()접근 제어자가 public  이므로 Card클래스어서 오버라이딩 할때도 public 으로 했다..