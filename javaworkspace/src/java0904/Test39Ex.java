package java0904;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	����� ���� ���߱� ������ ����� ������. (�ڵ� �ϳ��� ���� ����)
	1) �����̸�(country)�� ����(capital)�� ������ NationŬ������ �ۼ��ϰ�,
		ArrayList<Nation> �÷����� �̿��Ͽ� �Ʒ� ���� ���ÿ� ���� �۵��ǵ��� ���α׷��� �ۼ��ϼ���.
	���࿹��:
 ** ���� ���߱� ������ �����մϴ� **
		�Է�:1, ����:2, ����:3 >> 1 (����ڰ� �Է�)
		���� 8���� ����� ������ �ԷµǾ� �ֽ��ϴ�.
		����� ���� �Է�9>> �ѱ� ����
		����� ���� �Է�10>> �׸��� ���׳�
		�׸����� �̹� �ֽ��ϴ�!!
		����� ���� �Է�10>> ȣ�� �õ��
		����� ���� �Է�11>> ��Ż���� �θ�
		����� ���� �Է�10>> �׸�
		�Է�:1, ����:2, ����:3 >> 2
		ȣ���� ������? �õ��
		����!!
		������ ������? �Ͼ��
		�ƴմϴ�!!
		�߽����� ������? �Ͼ��
		�ƴմϴ�!!
		��Ż������ ������? �θ�
		����!!
		�ѱ��� ������? ����
		����!!
		������ ������? �׸�
		�Է�:1, ����:2, ����:3 >> 3
		������ �����մϴ�.
 */
class CapitalGame{
	HashMap <String,String> map;
	Scanner sc ;
	String country;
	String capital;
	CapitalGame(){
		map = new HashMap<>();
		sc = new Scanner(System.in);
		System.out.println("** ���� ���߱� ������ �����մϴ� **");
	}
	void run() {
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==1) addList();
			else if(sel==2) quiz();
			else if(sel==3) return;
			else System.out.println("�� �� �Է��߽��ϴ�.");
		}
	}
	void addList() {
		System.out.println("���� "+map.size()+"���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.print("����� ���� �Է�"+(map.size()+1)+">>");
			String input = sc.nextLine();
			if(input.equals("�׸�")) return;
			String [] data = input.split(" ");
			country= data[0];
			capital=data[1];
			if(map.get(country)!=null) {
				System.out.println(country+"�� �̹� �ֽ��ϴ�!!");				
			}
			else {
				map.put(country, capital);
			}
		}
	}
	void quiz() {
		if(map.isEmpty()) {
			System.out.println("���� ����Ʈ�� ��� �־� ���� ������ �Ұ��� �մϴ�.");
			return;
		}
		while(true) {
			Set <String>set = map.keySet();
			Iterator<String> it =set.iterator();
			int random = (int)(Math.random()*map.size());
			for(int i =0;i<random;i++) {
				it.next();
			}
			country = it.next();
			capital = map.get(country);
			System.out.println(country+"�� ������?");
			String input = sc.nextLine();
			if(input.equals("�׸�")) return;
			if(input.equals(capital))System.out.println("����");
			else	System.out.println("�ƴմϴ�!!");
		}
	}

}


public class Test39Ex {
	public static void main(String[] args) {

		CapitalGame game = new CapitalGame();
		game.run();
		System.out.println("���� ����");
	}
}
