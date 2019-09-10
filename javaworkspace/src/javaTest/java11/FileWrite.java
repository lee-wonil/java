package javaTest.java11;
import java.io.*;
import java.util.*;
class  FileWrite{
	public static void main(String[] args)throws Exception {
		String file, str;
		Date date = new Date();
		str = "파일 생성시간\n"+date+"\n";
		BufferedReader read = 
		new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름을 입력하세요==");
		file = read.readLine();
		System.out.println("저장할 문자열을 입력하세요=====");
		str +=read.readLine();
		char [] ch_str = new char[str.length()];
		str.getChars(0,str.length(), ch_str , 0);
		FileWriter fw = new FileWriter(file);
		fw.write(ch_str);
		fw.close();
		System.out.println(file+" 파일을 성공적으로 저장했습니다.");
	}
}

//   File  / Object / Data














