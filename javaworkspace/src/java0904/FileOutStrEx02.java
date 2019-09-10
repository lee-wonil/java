package java0904;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileOutStrEx02 {

	public static void main(String[] args) {
		String file,str;
		Date date = new Date();		
		Scanner sc = new Scanner(System.in);
		str ="파일 생성시간\n\n" + date +"\n\n";
		System.out.print("파일이름 입력 >>");
		file = sc.nextLine();
		System.out.print("저장할 문자열 입력>>");
		str += sc.nextLine();
		byte[] byte_str=str.getBytes();// 바이트 단위로 넘기기 위함
		// 스트림 생성
		FileOutputStream fout = null;
		try {
			//fout = new FileOutputStream("c:\\temp\\"+file);
			fout = new FileOutputStream(file);// c:\\temp\\stringTest.txt
			// 쓰기
			fout.write(byte_str);

		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fout!=null)try {
				fout.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(sc!=null)try {
				sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(file+" 파일을 성공적으로 저장했습니다.");
	}

}
