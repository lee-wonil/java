package javaTest.java11;
import java.io.*;
import java.util.*;
class  FileWrite{
	public static void main(String[] args)throws Exception {
		String file, str;
		Date date = new Date();
		str = "���� �����ð�\n"+date+"\n";
		BufferedReader read = 
		new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �̸��� �Է��ϼ���==");
		file = read.readLine();
		System.out.println("������ ���ڿ��� �Է��ϼ���=====");
		str +=read.readLine();
		char [] ch_str = new char[str.length()];
		str.getChars(0,str.length(), ch_str , 0);
		FileWriter fw = new FileWriter(file);
		fw.write(ch_str);
		fw.close();
		System.out.println(file+" ������ ���������� �����߽��ϴ�.");
	}
}

//   File  / Object / Data














