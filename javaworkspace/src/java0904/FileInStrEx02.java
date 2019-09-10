package java0904;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInStrEx02 {

	public static void main(String[] args) {
		//c:\\temp\\stringTest.txt
		int i=0;
		String file;
		Scanner sc = new Scanner(System.in);
		System.out.print("읽어올 파일 입력>>");
		file = sc.nextLine();
		try {
			// 스트림 생성, 경로 지정
			FileInputStream fin = new FileInputStream(file);
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
			sc.close();
		}catch(IOException e ) {
			e.printStackTrace();
		}

	}

}
