package java0904;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStrReaderEx01 {
	public static void main(String[] args) {
		// InputStreamReader : 바이트 스트림 --> 문자스트림
		// 텍스트 파일을 읽기 위해 바이트파일 입력 스트림 선언
		FileInputStream fin = null;
		//바이트 스트림으로 읽어 온것을 문자 스트림으로 변환하여 꺼내기 위해
		// 인풋스트림 리더 선언
		InputStreamReader in =null;
		try {
			fin = new FileInputStream("c:\\Temp\\stringTest.txt");
			in = new InputStreamReader(fin);
			int c;
			System.out.println("encoding : "+in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
				
			}
			
			fin.close();
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
