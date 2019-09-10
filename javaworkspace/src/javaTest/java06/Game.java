package javaTest.java06;

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
	void boardReset() {
		for(int i = 0; i < NUM_BOARD; i++) {
			theBoard[i] = " ";
		}
	}
	void setPlayerLetter() {
		String letter = "";
		while(!(letter.equals("X") || letter.equals("O"))) {
			System.out.print("X�� �ϰ� �ͳ���, O�� �ϰ� �ͳ���? >>");
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
	boolean isSpaceFree(int move, String[] board) { // overloading ����
		if(board[move].equals(" ") && move != 0) return true;
		else return false;
	}
	int getPlayerMove() {
		String move = "0";
		while(!"123456789".contains(move) || !isSpaceFree(Integer.parseInt(move)) ) {
			System.out.print("��� ��ũ�ұ��?(1-9) >>");
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
		for(int i = 0; i < 20; i++) {		// ���Ƿ� 20�� ������
			int randI = (int)(Math.random()*4);
			if(isSpaceFree(idxs[randI])) return idxs[randI];
		}
		return 0;
	}
	int getComputerMove() {
		String [] copy = null;
		// ��ǻ�ͼ� �ùķ��̼�
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, computerLetter, copy);
				if(isWinner(computerLetter, copy)) {
					return i;
				}
			}
		}
		// �÷��̾�� �ùķ��̼�
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, playerLetter, copy);
				if(isWinner(playerLetter, copy)) {
					return i;
				}
			}
		}
		// 1,3,7,9�߿� ����
		int move = chooseRandomMoveFromList(new int[] {1,3,7,9});
		if(move != 0) {
			return move;
		}
		// ���
		if(isSpaceFree(5)) return 5;
		
		// �������߿� ���
		return chooseRandomMoveFromList(new int[] {2,4,6,8});
	}
	boolean isWinner(String letter, String [] bo) {
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
	boolean isBoardFull() {
		for(int i = 1; i < NUM_BOARD; i++) {
			if(isSpaceFree(i)) return false;
		}
		return true;
	}
	boolean playAgain() {
		System.out.print("������ �ٽ� �Ͻðڽ��ϱ�?(y/n) ");
		String res = sc.nextLine().toLowerCase();
		if(res.equals("y")) return true;
		return false;
	}
	void run() {
		System.out.println("ƽ���� ����!");
		while(true) {
			boardReset();
			setPlayerLetter();
			String turn = whoGoesFirst();
			System.out.println(turn + "�� ���� �����ϰڽ��ϴ�.");
			boolean play = true;
			
			while(play) {
				int move = 0;
				if(turn.equals("player")) {
					drawBoard();
					move = getPlayerMove();
					makeMove(move, playerLetter, theBoard);
					
					if(isWinner(playerLetter, theBoard)) {
						drawBoard();
						System.out.println("�̰��!!");
						play  = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("����...");
							break;
						}else {
							turn = "computer";
						}
					}
				}else {
					move = getComputerMove();
					makeMove(move, computerLetter, theBoard);
					
					if(isWinner(computerLetter, theBoard)) {
						drawBoard();
						System.out.println("����..��ǻ�� �¸�...");
						play = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("����....");
							break;
						}else {
							turn = "player";
						}
					}
				}
			}//while(play)
			if(!playAgain()) {
				System.out.println("��������!!");
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
