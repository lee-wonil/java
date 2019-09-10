package java0904;

import java.io.File;

public class FileEx02 {
	public static void main(String[] args) {
		File f = new File("c:\\Temp\\kor.txt");
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		File f1 = new File("c:\\Temp\\java_sample");
		if(!f1.exists()) {
			f1.mkdir();
		}	
		
		
	}
}
