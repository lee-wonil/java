package java0822;

import java.util.Scanner;

class Player{
	private String name;// �̸�
	private String word;// �ܾ�	
	private boolean pass;// �����ձⰡ �����ߴ��� Ȯ�����ִ� ����
	Scanner sc ;
	Player(String name){// �̸��� �Ű������� �޴� ������
		this.name=name;		
		sc = new Scanner(System.in);
	}	
	public String getWordFromUser() { //�ܾ� �Է� �޴� �޼ҵ�
		
		System.out.print(name+">>");
		word= sc.nextLine();		
		return word;//�������ִ� ������ WordGameApp Ŭ�������� ������ �ܾ� üũ�ϱ� ���ؼ� 
	}
	public boolean checkSuccess(String lastword) { // ������ �ܾ �Ű������� �޾� ù �ܾ�� �� �ܾ ��ġ �ϸ� true ���� �ƴ� ��� false ����		
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
	public String getName() { // � �÷��̾ �ɷȴ��� Ȯ���� �ֱ� ���ؼ� getName()�޼ҵ常 ���� �Ѵ�
		return name;
	}
}