package java0904;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInStrEx01 {
	public static void main(String[] args) {
		
		byte[] b = new byte[7];
		try {
			//1. 파일 입력 스트림 생성
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.out");
			// 2.파일 읽기
			int n=0;	// 배열 index로 잡을 변수
			int c;		// 읽은 파일 임시저장 변수
			while((c=fin.read())!=-1) {	// 파일의 끝(EOF)까지 반복해서 읽기
				b[n]=(byte)c;
				n++;
			}
			//3. 파일 출력해서 확인
			for(int i =0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			System.out.println("n : "+n);
			//4. 스트림 닫기
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
