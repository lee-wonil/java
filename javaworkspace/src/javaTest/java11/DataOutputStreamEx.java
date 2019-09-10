package javaTest.java11;
import java.io.*;
import java.util.*;
class  DataOutputStreamEx{
	public static void main(String[] args) throws Exception{
		File tf = new File("e://test.txt");
		FileOutputStream fos = new FileOutputStream(tf);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(100);
		dos.writeLong(1000);
		dos.writeFloat(6.7f);
		dos.writeDouble(10.15);
		dos.flush();
		System.out.println("testEx.txtø°"+dos.size()+ " byte ¿˙¿Â");
		dos.close();
	}
}
