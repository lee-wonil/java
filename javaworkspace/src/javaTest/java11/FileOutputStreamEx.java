package javaTest.java11;
import java.io.*;
import java.util.*;
class  FileOutputStreamEx{
	public static void main(String[] args)throws Exception {
		String file, str;
		Date date = new Date();
		str = "파일 생성시간\n"+date+"\n";
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름을 입력하세요==");
		file = read.readLine();
		System.out.println("저장할 문자열을 입력하세요=====");
		str +=read.readLine();
		byte [] byte_str = str.getBytes();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(byte_str);
		fos.close();
		System.out.println(file+" 파일을 성공적으로 저장했습니다.");
	}
}
