package javaBaekjoon0920;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		HashMap <Character,Integer> map = new HashMap<>();
	
		int col = 0;
		for(int i=0;i<num;i++) {
			String input = sc.nextLine();
			for(int j=0;j<input.length();j++) {
				char c = input.charAt(j);
				if(map.get(c)==null || map.get(c)==j-1) {
					map.put(c, j);
				}
				else {
					map.put(c, 999);
				}
			}
			Set<Character> set = map.keySet();
			Iterator<Character> it =set.iterator();
			boolean b=false;
			while(it.hasNext()) {
				if(map.get(it.next())==999) {
					b= true;
					break;				
				}
			}
			if(!b) col++;
			map.clear();
		}
		System.out.println(col);
		sc.close();
	}

}
