package java0904;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStrReaderEx01 {
	public static void main(String[] args) {
		// InputStreamReader : ����Ʈ ��Ʈ�� --> ���ڽ�Ʈ��
		// �ؽ�Ʈ ������ �б� ���� ����Ʈ���� �Է� ��Ʈ�� ����
		FileInputStream fin = null;
		//����Ʈ ��Ʈ������ �о� �°��� ���� ��Ʈ������ ��ȯ�Ͽ� ������ ����
		// ��ǲ��Ʈ�� ���� ����
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
