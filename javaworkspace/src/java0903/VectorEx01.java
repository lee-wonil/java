package java0903;
import java.util.*;
public class VectorEx01 {
	public static void main(String[] args) {
		// # ���� ����
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));	//����
		v.add(new Integer(20));
		v.add(new Integer(30));
		// �ڵ� �ڽ�
		v.add(100);	// new Integer(100)		
		v.add(200);
		v.add(300);
		
		v.add(null);// null ���� ����
		v.add(2,100);	// index, ���
		
		// ���� ��� ������ : get(index), elementAt(index)		
		int i = v.get(1);
		Integer ii =v.get(1);
		System.out.println(i);
		System.out.println(ii);
		
		// ũ��� �뷮 ������
		int len = v.size();
		System.out.println(len);
		int cap = v.capacity();
		System.out.println(cap);
		
		// ��� ���� : remove(index), remove(���)
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		
		v.remove(new Integer(100));
		System.out.println(v);
		
		System.out.println(v.get(1));
		
		// ��ü ����
		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.size());			// ������� ��ü ������ 0���� �ʱ�ȭ�ȴ�.
		System.out.println(v.capacity());		// ��ü ������ �뷮�� ������ �ʴ´�.

	}
}
