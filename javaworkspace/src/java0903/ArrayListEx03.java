package java0903;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
	
	public static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));	// �⺻�����ٴ� �������� ���������� ����ϴ� ���� ����.
		
		list1.add(new Integer(4));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		ArrayList list2 = new ArrayList(list1.subList(2, 4));	// �ε��� ��ȣ�� �����ؼ� �����ؼ� �ִ´�.
		//System.out.println(list1,list2);
		print(list1,list2);
		System.out.println(list1.size());
		System.out.println(list2.size());
		Collections.sort(list1);
		print(list1,list2);
		System.out.println(list1.containsAll(list2));	// ������ ��Ұ� ��� ���ԵǾ� �ִ��� Ȯ��
		list2.add("A");
		list2.add("B");
		print(list1,list2);
		
		list2.set(3, "abc");
		print(list1,list2);
		System.out.println(list1.retainAll(list2));
		print(list1,list2);
		
		// list2���� list1�� ���Ե� ��ü���� ����
		for(int i=list1.size();i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);

		
	}
}
