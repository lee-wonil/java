package java0822;

import java.util.Scanner;

class Player{
	private String name;// 이름
	private String word;// 단어	
	private boolean pass;// 끝말잇기가 성공했는지 확인해주는 변수
	Scanner sc ;
	Player(String name){// 이름을 매개변수로 받는 생성자
		this.name=name;		
		sc = new Scanner(System.in);
	}	
	public String getWordFromUser() { //단어 입력 받는 메소드
		
		System.out.print(name+">>");
		word= sc.nextLine();		
		return word;//리턴해주는 이유는 WordGameApp 클래스에서 마지막 단어 체크하기 위해서 
	}
	public boolean checkSuccess(String lastword) { // 마지막 단어를 매개변수로 받아 첫 단어와 끝 단어가 일치 하면 true 리턴 아닌 경우 false 리턴		
		char lastWord=lastword.charAt(lastword.length()-1);
		char firstChar = word.charAt(0);
		if(lastWord==firstChar) {									
			pass = true;		
		}
		else {			
			pass = false;			
		}
		return pass;
	}	
	public String getName() { // 어떤 플레이어가 걸렸는지 확인해 주기 위해서 getName()메소드만 정의 한다
		return name;
	}
}