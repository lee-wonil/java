package javaTest.java11;
import java.io.*;
import java.util.*;
class  FileOutputStreamEx{
	public static void main(String[] args)throws Exception {
		String file, str;
		Date date = new Date();
		str = "���� �����ð�\n"+date+"\n";
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �̸��� �Է��ϼ���==");
		file = read.readLine();
		System.out.println("������ ���ڿ��� �Է��ϼ���=====");
		str +=read.readLine();
		byte [] byte_str = str.getBytes();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(byte_str);
		fos.close();
		System.out.println(file+" ������ ���������� �����߽��ϴ�.");
	}
}
