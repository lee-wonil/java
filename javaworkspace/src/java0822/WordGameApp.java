package java0822;

import java.util.Scanner;

class WordGameApp{
	Scanner sc ;
	private int count = 0; //�迭 ī����
	private int gamecount=0; // ù ������ ����Ű�� ī����
	private int playNum; // play�� ����
	private String startword="�ڵ���"; // �ܾ�
	private Player[] players;
	WordGameApp(){
		sc= new Scanner(System.in);
	}
	

	
	public void createPlayer() {
		System.out.print("�÷��̾� ���� �Է��ϼ���");
		playNum=Integer.parseInt(sc.nextLine());
		players=new Player[playNum];
		for(int i=0;i<playNum;i++) {
			System.out.print("�÷��̾��� �̸��� �Է��ϼ���");		
			players[i] = new Player(sc.nextLine());
		}
	}
	public void run() {
		System.out.println("�����ձ� ���� ����");
		createPlayer();
		String lastword=startword;
		System.out.println("�����ϴ� �ܾ�� "+lastword+"�Դϴ�.");
		while(true) {
			String newWord=players[count].getWordFromUser();
			if(!players[count].checkSuccess(lastword)) {
				System.out.println("��������!! "+players[count].getName()+"�� �й��߽��ϴ�.");
				break;
			}
			count++;
			count%=playNum;
			lastword = newWord;				
		}
	}
}