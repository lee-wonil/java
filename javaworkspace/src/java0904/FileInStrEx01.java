package java0904;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInStrEx01 {
	public static void main(String[] args) {
		
		byte[] b = new byte[7];
		try {
			//1. ���� �Է� ��Ʈ�� ����
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.out");
			// 2.���� �б�
			int n=0;	// �迭 index�� ���� ����
			int c;		// ���� ���� �ӽ����� ����
			while((c=fin.read())!=-1) {	// ������ ��(EOF)���� �ݺ��ؼ� �б�
				b[n]=(byte)c;
				n++;
			}
			//3. ���� ����ؼ� Ȯ��
			for(int i =0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			System.out.println("n : "+n);
			//4. ��Ʈ�� �ݱ�
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
