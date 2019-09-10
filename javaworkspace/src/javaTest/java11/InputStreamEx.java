package javaTest.java11;
import java.io.IOException; 
public class InputStreamEx{
	public static void main(String args[])throws IOException{
		System.out.println("입력하세요..");
		int _byte;
		while((_byte=System.in.read())!=-1){
			if(_byte == 10 || _byte == 13) continue;
			if(_byte == 113 || _byte==81) break;
			char c = (char) _byte; 
			System.out.printf("%s(%d)",c,_byte);
		}}}
