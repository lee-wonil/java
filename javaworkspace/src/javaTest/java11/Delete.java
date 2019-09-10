package javaTest.java11;
import java.io.*;
class  Delete{
	public static void main(String[] args) {
		
		try{	
			delete("e://Koala.jpg");
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}}
	public static void delete(String filename){
		File f = new File(filename);
		if(!f.exists())	
			fail("Delete : no such file or directory : "+filename);
		if(!f.canWrite())
			fail("Delete : wirte protected : "+filename);
		if(f.isDirectory()){	
			String [] files = f.list();	
			if(files.length > 0)
				fail("Delete : directory not empty : "+filename);	//파일목록이 하나이상이면 비어있는디록토리가 아니라는메시지
		}
		boolean success = f.delete();	//파일삭제
		if(!success) fail("Delete : deletion failed");
	}
	protected static void fail(String msg) throws IllegalArgumentException{
		throw new IllegalArgumentException(msg);
	}
}
