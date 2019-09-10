package java0904;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
	Scanner Ŭ������ ����Ͽ� 6�� ����('A', 'B', 'C', 'D', 'F')�� ���ڷ� �Է¹޾�
	ArrayList�� �����ϰ�, ArrayList�� �˻��Ͽ� ������ ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ�
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	���࿹��:
		6���� ������ �Է�(A/B/C/D/F)>>	 A C A B F D
		2.3333333333333335
*/
// �����ؾߵ�
public class Test30Ex_arraylist {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		String str = sc.nextLine();
		String [] scores = str.split(" ");
		ArrayList<String> array = new ArrayList<>();
		for(int i =0;i<scores.length;i++) {
			array.add(scores[i]);
		}
		int sum=0;
		boolean data=true;
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			String score = it.next();
			if(score.equals("A")) {
				sum+=4;
			}else if(score.equals("B")) {
				sum+=3;
			}else if(score.equals("C")) {
				sum+=2;
			}else if(score.equals("D")) {
				sum+=1;
			}else if(score.equals("F")) {
				sum+=0;
			}else {
				System.out.println("�߸��� ���� �Է��� �Ǿ� �ֽ��ϴ�.");
				data=false;
				break;
			}		
		}		
		if(data==true) {
			System.out.println((double)sum/scores.length);
		}else {
			System.out.println("�߸��� ���� �Է��� �Ǿ� ����� �� �� �����ϴ�..");
		}
		sc.close();
	}
}
