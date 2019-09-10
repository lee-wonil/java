package javaTest.java11;
import java.io.*;
import java.util.*;
class  DataIntputStreamEx{
	public static void main(String[] args) throws Exception{
		File tf = new File("e://test.txt");
		FileInputStream fis = new FileInputStream(tf);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());	
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		dis.close();
	}
}
