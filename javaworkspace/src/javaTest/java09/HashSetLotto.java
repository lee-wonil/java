package javaTest.java09;
import java.util.*;
class HashSetLotto{
	public static void main(String[] args) {
		TreeSet set = new TreeSet();	//TreeSet : HashSet�� ������ �Ȱ����� ���ı���� �ִ�. 
		                                 //�̸��� Tree�� ���� ��� ���ı�ɶ����� �����Ͱ� ���� ��� �ӵ��� ������/������������
		for (int i = 0; set.size() < 6 ; i++) {//size �� ���ϰ� �����Ƿ� �ߺ����� ������ ��� �ߺ��� ��� x
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		System.out.println(set);
	
	}
}


