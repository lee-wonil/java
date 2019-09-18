package javaBaekjoon0918;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			String t = String.valueOf(c);
			t=t.toUpperCase();
			map.put(t, map.getOrDefault(t, 0)+1);
		}
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		int max = 0;
		String st;
		String mst="";
		boolean b = false;
		while(it.hasNext()) {
			st = it.next();
			int a = map.get(st);
			if(max<a) {
				max=a;
				b = false;
				mst=st;
			}
			else if(max==a) {
				b= true;
			}
		}
		if(!b) {
			System.out.println(mst);			
		}
		else {
			System.out.println("?");
		}
		sc.close();
	}

}
