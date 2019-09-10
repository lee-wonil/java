package java0823;

import java.util.Scanner;

/*
n명이 참가하는 끝말잇기 게임을 만들어보자.
처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다.
끝말잇기에서 틀리면 게임오버 -> 진사람이름 출력, 끝. 
WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성.
WordGameApp :게임을 전체적으로 진행하는 run(), run()에서 플레이어수 만큼 Player객체 배열 생성
ClassEx31:main()메서드 (출발점)
Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메소드
#tip : 문자열 첫번째 문자 알아내는 방법 >>
String word = "자동차";
char firstChar = word.charAt(0);
*/
class Player{
	private String name;
	private String inputWord;
	private Scanner sc=new Scanner(System.in);
	Player(String name){
		this.name=name;
		inputWord=" ";	
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getWordFromUser() {
		System.out.print(name+">>");
		inputWord=sc.nextLine();
		return inputWord;
	}
	public boolean checkSuccess(String lastWord) {
		boolean check=false;
		int lastIdx=lastWord.length()-1;
		char lastChar = lastWord.charAt(lastIdx);
		char firstChar = inputWord.charAt(0);
		if(lastChar == firstChar) {
			check = true;
		}
		return check;
	}
	
}
class WordGameApp{
	private Player[]p;
	private String startWord = "자동차";
	Scanner sc;
	WordGameApp(){
		sc= new Scanner(System.in);
	}
	public void createPlayers() {		
		System.out.print("게임 참가하는 인원>>");
		int num=Integer.parseInt(sc.nextLine());
		p=new Player[num];
		for(int i = 0;i<num;i++) {
			System.out.print("플레이어 이름을 입력하세요");			
			p[i]= new Player(sc.nextLine());
		}
	}
	public void run() {
		System.out.println("끝말잇기 게임 시작!!");
		createPlayers();
		String lastWord = startWord;
		System.out.println("시작하는 단어는 "+startWord+"입니다.");
		int index=0;//게임 참가자들이 들어있는 배열의 인덱스 번호 변수 선언. 각 참가자는 인덱스 번호로 순서를 알게됨
		while(true) {
			String newWord=p[index].getWordFromUser();
			if(!p[index].checkSuccess(lastWord)) {
				System.out.println("게임오버!!"+p[index].getName()+"님이 졌습니다.");
				break;
			}			
			index++;
			index%=p.length;
			lastWord=newWord;
		}
	}
}
public class ClassEx31 {
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
		
	}
	
}
