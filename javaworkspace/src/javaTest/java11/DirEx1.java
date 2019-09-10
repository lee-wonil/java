package javaTest.java11;
import java.io.File;
class DirEx1{
	public static void main(String[] args) {
		File dir2 = new File("c://");
		File [] str = dir2.listFiles();
		for(int i = 0; i < str.length; i++){
		System.out.println(str[i].getName());
		}
	}
}
