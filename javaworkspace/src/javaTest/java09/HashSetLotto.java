package javaTest.java09;
import java.util.*;
class HashSetLotto{
	public static void main(String[] args) {
		TreeSet set = new TreeSet();	//TreeSet : HashSet과 내용은 똑같으나 정렬기능이 있다. 
		                                 //이름에 Tree가 붙은 경우 정렬기능때문에 데이터가 많을 경우 속도가 느려짐/권장하지않음
		for (int i = 0; set.size() < 6 ; i++) {//size 로 비교하고 있으므로 중복값이 나왔을 경우 중복값 허용 x
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		System.out.println(set);
	
	}
}


