package java0823;

/*
노래 한곡을 나타내는 Song 클래스를 작성하세요. Song은 다음 필드로 구성됩니다. 
	- 노래의 제목을 나타내는 title
	- 가수를 나타내는 artist
	- 노래가 발표된 연도를 나타내는 year
	- 국적을 나타내는 country
또한, Song클래스에 다음 생성자와 메소드를 작성하세요. 
	- 생성자 2개 : 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자 
	- 노래 정보를 출력하는 show()메소드
	- main() 메소드에서는 2017년, 한국국적의 Collective Arts가 부른 "Alone"를 Song객체로 생성하고, 
  		show()를 이용하여 노래의 정보를 아래와 같이 출력하세요. 
  		
콘솔 출력예 >> 2017년 한국국적의 Collective Arts가 부른 Alone
*/

class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	Song(){
		title=" ";
		artist=" ";
		year=0;
		country=" ";
	}
	Song(String title,String artist,int year,String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
	void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
}

public class ClassEx34 {

	public static void main(String[] args) {
		Song song = new Song("Alone","Collective Arts",2017,"한국");
		song.show();

	}

}
