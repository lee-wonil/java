package java0822;

import java.util.Scanner;

class WordGameApp{
	Scanner sc ;
	private int count = 0; //배열 카운터
	private int gamecount=0; // 첫 시작을 가르키는 카운터
	private int playNum; // play의 숫자
	private String startword="자동차"; // 단어
	private Player[] players;
	WordGameApp(){
		sc= new Scanner(System.in);
	}
	

	
	public void createPlayer() {
		System.out.print("플레이어 수를 입력하세요");
		playNum=Integer.parseInt(sc.nextLine());
		players=new Player[playNum];
		for(int i=0;i<playNum;i++) {
			System.out.print("플레이어의 이름을 입력하세요");		
			players[i] = new Player(sc.nextLine());
		}
	}
	public void run() {
		System.out.println("끝말잇기 게임 시작");
		createPlayer();
		String lastword=startword;
		System.out.println("시작하는 단어는 "+lastword+"입니다.");
		while(true) {
			String newWord=players[count].getWordFromUser();
			if(!players[count].checkSuccess(lastword)) {
				System.out.println("게임종료!! "+players[count].getName()+"가 패배했습니다.");
				break;
			}
			count++;
			count%=playNum;
			lastword = newWord;				
		}
	}
}