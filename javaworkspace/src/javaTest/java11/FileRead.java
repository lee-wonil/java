package javaTest.java11;
import java.io.*;
class  FileRead{
	public static void main(String[] args)throws Exception {
		int i = 0;
		String file;
		BufferedReader read = 
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�о�� ������ �Է��ϼ���==");
		file = read.readLine();
		System.out.println(file+" ������ ����==========");
		FileReader fr = new FileReader(file);
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
	}
}
          