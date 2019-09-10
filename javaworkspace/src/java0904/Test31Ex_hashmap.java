package java0904;

import java.util.HashMap;
import java.util.Scanner;

/*
	"�׸�"�� �Էµ� ������ �����̸��� �α��� �Է¹޾� �����ϰ�, 
	�ٽ� �����̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��ϼ���. �Ʒ� �ؽ����� �̿��ϼ���.
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	���࿹�� :
		���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)
		���� �̸�, �α� >>  Korea 5000
		���� �̸�, �α� >>  USA 1000000
		���� �̸�, �α� >>  Swiss 2000
		���� �̸�, �α� >>  France 3000
		���� �̸�, �α� >>  �׸�
		�α� �˻� >> France
		France�� �α��� 3000
		�α� �˻� >> ������
		������ ����� �����ϴ�.
		�α� �˻� >> �׸�
		���α׷� ����!
 */
public class Test31Ex_hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� �Է��ϼ���");
		while(true) {
			System.out.print("���� �̸�, �α� >>");
			String input = sc.nextLine();
			if(input.equals("�׸�")) break;
			String [] data = input.split(" ");
			String country = data[0];
			int population = Integer.parseInt(data[1]);			
			nations.put(country, population);
		}		
		while(true) {
			System.out.print("�α� �˻�>>");
			String country = sc.nextLine();
			if(country.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
			Integer population = nations.get(country);
			if(population!=null)
				System.out.println(country+"�� �α��� "+ population);
			else
				System.out.println(country+" ����� �����ϴ�. ");
		}
		sc.close();


	}
}
