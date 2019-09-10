package java0823;

import java.util.Scanner;

/*
n���� �����ϴ� �����ձ� ������ ������.
ó���ܾ�� "�ڵ���"�̴�. n���� �����ڵ��� ������� �ڽ��� �ܾ �Է��ϸ�ȴ�.
�����ձ⿡�� Ʋ���� ���ӿ��� -> ������̸� ���, ��. 
WordGameApp Ŭ������ �� ������ ��Ÿ���� Player Ŭ���� �ۼ�.
WordGameApp :������ ��ü������ �����ϴ� run(), run()���� �÷��̾�� ��ŭ Player��ü �迭 ����
ClassEx31:main()�޼��� (�����)
Player : �÷��̾� �̸�, �ܾ��Է¹޴� getWordFromUser()�޼���, �����ձ� �������ο� ���Ӱ������ �Ǻ��ϴ� checkSuccess() �޼ҵ�
#tip : ���ڿ� ù��° ���� �˾Ƴ��� ��� >>
String word = "�ڵ���";
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
	private String startWord = "�ڵ���";
	Scanner sc;
	WordGameApp(){
		sc= new Scanner(System.in);
	}
	public void createPlayers() {		
		System.out.print("���� �����ϴ� �ο�>>");
		int num=Integer.parseInt(sc.nextLine());
		p=new Player[num];
		for(int i = 0;i<num;i++) {
			System.out.print("�÷��̾� �̸��� �Է��ϼ���");			
			p[i]= new Player(sc.nextLine());
		}
	}
	public void run() {
		System.out.println("�����ձ� ���� ����!!");
		createPlayers();
		String lastWord = startWord;
		System.out.println("�����ϴ� �ܾ�� "+startWord+"�Դϴ�.");
		int index=0;//���� �����ڵ��� ����ִ� �迭�� �ε��� ��ȣ ���� ����. �� �����ڴ� �ε��� ��ȣ�� ������ �˰Ե�
		while(true) {
			String newWord=p[index].getWordFromUser();
			if(!p[index].checkSuccess(lastWord)) {
				System.out.println("���ӿ���!!"+p[index].getName()+"���� �����ϴ�.");
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
