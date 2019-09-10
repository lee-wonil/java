package java0828;
import java.util.*;
// �߻� Ŭ���� 
/*
	Ű�� ���� �ϳ��� ���������� �����ϰ� �˻� ������ ������ PairMap �߻� Ŭ������ �ֽ��ϴ�.
	PairMap�� ��ӹ޴� DictionaryŬ������ �����ϰ�, �̸� �Ʒ��� ���� Ȱ���ϴ� main()�޼ҵ带 ����
	Ŭ���� DictionaryApp�� �ۼ��ϼ���.(�Ʒ� Ǯ�̴� DictionaryApp�� �ƴ� ���ϸ� Ŭ�������� main() ������)
	������ : 
		�������� ���� ������
		��Ƹ��� ���� �ڹ�
		��Ƹ��� ���� null
*/

abstract class PairMap {
	protected String [] keyArray;		// key���� �����ϴ� �迭
	protected String [] valueArray;		// value���� �����ϴ� �迭
	abstract String get(String key);	// key���� ���� value����. ������ null����
	abstract void put(String key, String value);	// key�� value�� ������ ����, ������ key�� ������, ���� value�� ����
	abstract String delete(String key);	// key���� ���� ������(value�� �Բ�) ����. ������ value�� ����
	abstract int length();				// ���� ����� �������� ���� ����
}
class Dictionary extends PairMap{
	int count=0;
	int length;
	ArrayList<Integer> delete = new ArrayList<Integer>();
	Dictionary(int length){
		keyArray= new String[length];
		valueArray= new String[length];
		this.length=length;
	}
	@Override
	String get(String key) {
		int index= findkey(key);
		if(index==-1) {
			return null;
		}
		else {
			return valueArray[index];
		}
	}
	int findkey(String key) {
		
		for(int i=0;i<keyArray.length;i++) {			
			if(key.equals(keyArray[i])&&key!=null)
				return i;
		}
		return -1;// ��ã�� ��� -1 ����
	}

	@Override
	void put(String key, String value) {
		int index= findkey(key);
		if(count==length) {
			System.out.println("���̻� �߰� �� �� �����ϴ�.");
			return;	// �迭�� ���� ��쿡�� 	���	
		}
		if(index==-1) { // Ű�� ����Ǿ� ���� ���� ��� �迭�� ���� �� �ʿ� ����
			if(delete.isEmpty()) {
				keyArray[count]=key;
				valueArray[count]=value;
				count++;
			}
			else {
				index = delete.remove(0);				
				keyArray[index]=key;
				valueArray[index]=value;
			}
		}
		else {	// Ű�� ����Ǿ� �ִ� ��� �ش� �ε����� ���ο� ���� �ִ´�.
			keyArray[index]=key;
			valueArray[index]=value;			
		}
	}

	@Override
	String delete(String key) {			// delete ���� �ٽ��ϱ� ���� �迭 �� �߿� �����Ǿ� �ִ� ��쿡�� ���Խ� �켱 ������ �ϱ� ���ؼ�....		
		int index= findkey(key);
		delete.add(index);
		if(index ==-1)
			return null;
		else {
			String tmp = valueArray[index];
			keyArray[index]=null;
			valueArray[index]=null;
			return tmp;
		}
	}

	@Override
	int length() {
		if(delete.isEmpty())
			return count;
		else
			return count-delete.size();
	}
	
}

public class ClassTest69Ex {
	public static void main(String[] args) {
		
		Dictionary dic = new Dictionary(10);
		dic.put("��Ƹ�", "�ڹ�");
		dic.put("�ֿ���", "jsp");
		dic.put("������", "�ȵ���̵�");
		dic.put("������", "������");							// �������� ���� �����ͷ� ����
		System.out.println("�������� ���� "+dic.get("������"));
		System.out.println("��Ƹ��� ���� "+dic.get("��Ƹ�"));
		dic.delete("��Ƹ�");									// ��Ƹ� ������ ����
		System.out.println("��Ƹ��� ���� "+dic.get("��Ƹ�"));	// ������ ������ ����

	}
}
