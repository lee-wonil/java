package javaTest.java09;
import java.util.*;
class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Tv());
		set.add(new Tv());
		System.out.println(set);
	}
}
class Tv{}