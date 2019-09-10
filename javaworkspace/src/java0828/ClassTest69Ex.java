package java0828;
import java.util.*;
// 추상 클래스 
/*
	키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 PairMap 추상 클래스가 있습니다.
	PairMap을 상속받는 Dictionary클래스를 구현하고, 이를 아래와 같이 활용하는 main()메소드를 가진
	클래스 DictionaryApp도 작성하세요.(아래 풀이는 DictionaryApp이 아닌 파일명 클래스에서 main() 구현함)
	실행결과 : 
		노현태의 값은 빅데이터
		김아림의 값은 자바
		김아림의 값은 null
*/

abstract class PairMap {
	protected String [] keyArray;		// key들을 저장하는 배열
	protected String [] valueArray;		// value들을 저장하는 배열
	abstract String get(String key);	// key값을 가진 value리턴. 없으면 null리턴
	abstract void put(String key, String value);	// key와 value를 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key);	// key값을 가진 아이템(value와 함께) 삭제. 삭제된 value값 리턴
	abstract int length();				// 현재 저장된 아이템의 개수 리턴
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
		return -1;// 못찾는 경우 -1 리턴
	}

	@Override
	void put(String key, String value) {
		int index= findkey(key);
		if(count==length) {
			System.out.println("더이상 추가 할 수 없습니다.");
			return;	// 배열이 꽉찬 경우에는 	취소	
		}
		if(index==-1) { // 키가 저장되어 있지 않은 경우 배열의 가장 끝 쪽에 저장
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
		else {	// 키가 저장되어 있는 경우 해당 인덱스에 새로운 값을 넣는다.
			keyArray[index]=key;
			valueArray[index]=value;			
		}
	}

	@Override
	String delete(String key) {			// delete 구현 다시하기 만약 배열 값 중에 삭제되어 있는 경우에는 삽입시 우선 삽입을 하기 위해서....		
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
		dic.put("김아림", "자바");
		dic.put("최여정", "jsp");
		dic.put("노현태", "안드로이드");
		dic.put("노현태", "빅데이터");							// 노현태의 값을 빅데이터로 수정
		System.out.println("노현태의 값은 "+dic.get("노현태"));
		System.out.println("김아림의 값은 "+dic.get("김아림"));
		dic.delete("김아림");									// 김아림 아이템 삭제
		System.out.println("김아림의 값은 "+dic.get("김아림"));	// 삭제된 아이템 접근

	}
}
