package java0904;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStrEx01 {
	public static void main(String[] args) {
		// ������
		byte[] b = {7,15,2,77,93,-2,100};
		try {
			// ���� ��� ��Ʈ�� ����
			FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");	// �̹� �����ϴ� ��쿡�� ������ ������ȴ�
			// ���� ����
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
