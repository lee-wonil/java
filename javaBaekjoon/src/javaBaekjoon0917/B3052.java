package javaBaekjoon0917;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class B3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] =new int[10]; 
		for(int i=0;i<10;i++) {
			int a = sc.nextInt();
			num[i]=a%42;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<num.length;i++) {
			map.put(num[i], 0);
		}
		Set<Integer> set = map.keySet();
		System.out.println(set.size());
		sc.close();
	}
}
