package java0822;

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


public class ClassEx31 {
	public static void main(String[] args) {
		WordGameApp game=new WordGameApp();
		game.run();
		
	}
}
