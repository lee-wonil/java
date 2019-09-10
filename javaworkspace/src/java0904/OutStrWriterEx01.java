package java0904;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class OutStrWriterEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		String str = "";
		str = "파일 생성 시간 "+date+" ";
		System.out.print("입력 >>");
		str += sc.nextLine();
		FileOutputStream fout = null;
		OutputStreamWriter out = null;
		try {
			fout = new FileOutputStream("c:\\Temp\\outStrWr.txt");
			out = new OutputStreamWriter(fout);
			out.write(str);
			out.flush();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fout!=null) try{fout.close();}catch(IOException e){e.printStackTrace();}
			if(out!=null) try{out.close();}catch(IOException e){e.printStackTrace();}
			if(sc!=null) try{sc.close();}catch(Exception e){e.printStackTrace();}
		}
		System.out.println("프로그램 종료");

	}

}
