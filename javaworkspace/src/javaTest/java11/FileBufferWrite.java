package javaTest.java11;
import java.io.*;
import java.util.*;
class  FileBufferWrite{
	public static void main(String[] args)throws Exception {
		String file, str;
		Date date = new Date();
		str = "���� �����ð�\n"+date+"\n";
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �̸��� �Է��ϼ���==");
		file = read.readLine();
		System.out.println("������ ���ڿ��� �Է��ϼ���=====");
		str +=read.readLine();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		System.out.println(file+" ������ ���������� �����߽��ϴ�.");
	}
}
