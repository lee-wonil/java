package java0903;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashEx01 {
	public static void main(String[] args) {
		//����
		HashMap<String, String> map = new HashMap<>();
		
		//��� ����
		map.put("Apple","���" );
		map.put("Strawberry","����" );
		map.put("Watermelon","����" );
		map.put("Peach","������" );
		
		// �� ������
		String res1 = map.get("Strawberry");
		System.out.println(res1);
		String res2= map.get("Peach");
		System.out.println(res2);
		String res3= map.get("Melon");
		System.out.println(res3);
		
		//����
		map.remove("Apple");
		System.out.println(map);
		
		// ��� ���� �˾Ƴ���
		int size = map.size();
		System.out.println(size);
		
		// �ؽ��� ��ü �˻�	: ��� Ű�� �˾Ƴ� ��, �� Ű�� ���� ���� �������� ���. keySet()
		Set <String> set= map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println("key :"+key+"\t value :"+val);
		}
	}
}
