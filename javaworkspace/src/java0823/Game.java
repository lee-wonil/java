package java0823;

import java.util.Scanner;

class TicTacToe {
	final int NUM_BOARD = 10;
	String [] theBoard = new String[NUM_BOARD];
	Scanner sc;
	String playerLetter;
	String computerLetter; 
	
	public TicTacToe() {
		sc = new Scanner(System.in);
	}
	void boardReset() { // 보드판 리셋
		for(int i = 0; i < NUM_BOARD; i++) {
			theBoard[i] = " ";
		}
	}
	void setPlayerLetter() {
		String letter = "";
		while(!(letter.equals("X") || letter.equals("O"))) {
			System.out.print("X를 하고 싶나요, O를 하고 싶나요? >>");
			letter = sc.nextLine().toUpperCase();
		}
		if(letter.equals("X")) {
			playerLetter = "X";
			computerLetter = "O";
		}else {
			playerLetter = "O";
			computerLetter = "X";
		}
	}
	String whoGoesFirst() {
		String turn = "player";
		if((int)(Math.random()*2) == 0) {
			turn = "computer";
		}
		return turn;
	}
	void drawBoard() {
		System.out.println(" " + theBoard[7] + " | " + theBoard[8] + " | " + theBoard[9]);
		System.out.println("------------");
		System.out.println(" " + theBoard[4] + " | " + theBoard[5] + " | " + theBoard[6]);		
		System.out.println("------------");
		System.out.println(" " + theBoard[1] + " | " + theBoard[2] + " | " + theBoard[3]);		
	}
	boolean isSpaceFree(int move) {
		if(theBoard[move].equals(" ")) return true;
		else return false;
	}
	boolean isSpaceFree(int move, String[] board) { // overloading 예시
		if(board[move].equals(" ") && move != 0) return true;
		else return false;
	}
	int getPlayerMove() {
		String move = "0";
		while(!"123456789".contains(move) || !isSpaceFree(Integer.parseInt(move)) ) {
			System.out.print("어디에 마크할까요?(1-9) >>");
			move = sc.nextLine();
		}
		return Integer.parseInt(move);
	}
	String[] getBoardCopy() {
		String [] copy = new String[NUM_BOARD];
		for(int i = 0; i < NUM_BOARD; i++) {
			copy[i] = theBoard[i];
		}
		return copy;
	}
	void makeMove(int move, String letter, String[] board) {
		board[move] = letter;
	}
	int chooseRandomMoveFromList(int [] idxs) {
		for(int i = 0; i < 20; i++) {		// 임의로 20번 돌리기
			int randI = (int)(Math.random()*4);
			if(isSpaceFree(idxs[randI])) return idxs[randI];
		}
		return 0;
	}
	int getComputerMove() {
		String [] copy = null;
		// 컴퓨터수 시뮬레이션
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, computerLetter, copy);
				if(isWinner(computerLetter, copy)) {
					return i;
				}
			}
		}
		// 플레이어수 시뮬레이션
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, playerLetter, copy);
				if(isWinner(playerLetter, copy)) {
					return i;
				}
			}
		}
		// 1,3,7,9중에 랜덤
		int move = chooseRandomMoveFromList(new int[] {1,3,7,9});
		if(move != 0) {
			return move;
		}
		// 가운데
		if(isSpaceFree(5)) return 5;
		
		// 나머지중에 빈곳
		return chooseRandomMoveFromList(new int[] {2,4,6,8});
	}
	boolean isWinner(String letter, String [] bo) {// 승리조건 확인
		boolean res = false;
		if((bo[7].equals(letter) && bo[8].equals(letter) && bo[9].equals(letter)) ||
			(bo[4].equals(letter) && bo[5].equals(letter) && bo[6].equals(letter)) ||
			(bo[1].equals(letter) && bo[2].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[4].equals(letter) && bo[1].equals(letter)) ||
			(bo[8].equals(letter) && bo[5].equals(letter) && bo[2].equals(letter)) ||
			(bo[9].equals(letter) && bo[6].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[5].equals(letter) && bo[3].equals(letter)) ||
			(bo[9].equals(letter) && bo[5].equals(letter) && bo[1].equals(letter))) { res = true; }
		return res;
	}
	boolean isBoardFull() {//보드판이 꽉찬 경우
		for(int i = 1; i < NUM_BOARD; i++) {
			if(isSpaceFree(i)) return false;
		}
		return true;
	}
	boolean playAgain() {//게임 재시작
		System.out.print("게임을 다시 하시겠습니까?(y/n) ");
		String res = sc.nextLine().toLowerCase();
		if(res.equals("y")) return true;
		return false;
	}
	void run() {
		System.out.println("틱택토 게임!");
		while(true) {
			boardReset(); //boardReset 메소드 호출
			setPlayerLetter();	// 사용자로 부터 O또는 X를 입력받아 플레이어가 선택하는 문자열로 게임 시 사용자가 선택한 것과 컴퓨터가 선택한 것을 구분을 짓게 하기 위한 메소드
			String turn = whoGoesFirst();//선공 후공 정하는 메소드
			System.out.println(turn + "가 먼저 시작하겠습니다.");
			boolean play = true;
			
			while(play) {
				int move = 0;
				if(turn.equals("player")) {	//사람이 먼저인 경우
					drawBoard();//보드를 그리는 메소드
					move = getPlayerMove();
					makeMove(move, playerLetter, theBoard);
					
					if(isWinner(playerLetter, theBoard)) {
						drawBoard();
						System.out.println("이겼다!!");
						play  = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼다...");
							break;
						}else {
							turn = "computer";
						}
					}
				}else {//컴퓨터가 선공인 경우
					move = getComputerMove();
					makeMove(move, computerLetter, theBoard);
					
					if(isWinner(computerLetter, theBoard)) {
						drawBoard();
						System.out.println("졌다..컴퓨터 승리...");
						play = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼네....");
							break;
						}else {
							turn = "player";
						}
					}
				}
			}//while(play)
			if(!playAgain()) {
				System.out.println("게임종료!!");
				break;
			}
		}// while(true)
	}
}
public class Game {
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.run();
	}
}
