package javaTest.java11;
import java.io.*;
class  ReadLine{
	public static void main(String[] args)throws IOException {
		String name = null;
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�о�� ���� => ");
		name = reader.readLine();
		FileReader fr = new FileReader(name);
		int i = 0;
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
	}
}
