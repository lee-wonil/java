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
		str ="���� �����ð�\n\n" + date +"\n\n";
		System.out.print("�����̸� �Է� >>");
		file = sc.nextLine();
		System.out.print("������ ���ڿ� �Է�>>");
		str += sc.nextLine();
		byte[] byte_str=str.getBytes();// ����Ʈ ������ �ѱ�� ����
		// ��Ʈ�� ����
		FileOutputStream fout = null;
		try {
			//fout = new FileOutputStream("c:\\temp\\"+file);
			fout = new FileOutputStream(file);// c:\\temp\\stringTest.txt
			// ����
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
		System.out.println(file+" ������ ���������� �����߽��ϴ�.");
	}

}
