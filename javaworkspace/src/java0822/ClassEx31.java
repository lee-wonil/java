package java0822;

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


public class ClassEx31 {
	public static void main(String[] args) {
		WordGameApp game=new WordGameApp();
		game.run();
		
	}
}
