package java0903;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList names = new ArrayList();
		for(int i =0;i<4;i++) {
			System.out.println("이름 입력 : ");
			String s = sc.nextLine();
			names.add(s);
		}
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		int longstIdx=0;
		for(int i =0;i<names.size();i++) {
			String tmp =(String) names.get(i);
			String li = (String) names.get(longstIdx);
			if(tmp.length()>li.length()) {
				longstIdx=i;
			}
		}
		System.out.println("가장 긴 이름은: "+(String)names.get(longstIdx));
		sc.close();
	}
}
