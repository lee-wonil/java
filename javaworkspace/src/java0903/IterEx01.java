package java0903;

import java.util.ArrayList;
import java.util.Iterator;

public class IterEx01 {
	public static void main(String[] args) {
		ArrayList <Integer> array = new ArrayList<>();
		for(int i =1;i<10;i++) {
			array.add(i);
		}
		//�ݺ��� ����
		//ArrayList�� �����ϴ� Iterator() �޼��带 ȣ���Ͽ�
		//a�� �� ��Ҹ� ���������� �˻�/���� �Ҽ� �ִ� Iterator��ü�� ��´�.
		Iterator<Integer> iter = array.iterator();
		while(iter.hasNext()) {	//iter�� ArrayList�� ��� ������ �ݺ�
			int a = iter.next();
			if(a%2==0) {
				iter.remove();
			}
		}
		System.out.println(array);
		
		// �ٽû���Ϸ��� Iterator() �ٽ� �����;� �Ѵ�.
		iter = array.iterator();
	}
	
}
