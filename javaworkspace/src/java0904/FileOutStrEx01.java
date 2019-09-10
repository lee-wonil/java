package java0904;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStrEx01 {
	public static void main(String[] args) {
		// 데이터
		byte[] b = {7,15,2,77,93,-2,100};
		try {
			// 파일 출력 스트림 생성
			FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");	// 이미 존재하는 경우에는 삭제후 재생성된다
			// 파일 쓰기
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}		
	}
}
