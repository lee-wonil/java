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
				fail("Delete : directory not empty : "+filename);	//���ϸ���� �ϳ��̻��̸� ����ִµ���丮�� �ƴ϶�¸޽���
		}
		boolean success = f.delete();	//���ϻ���
		if(!success) fail("Delete : deletion failed");
	}
	protected static void fail(String msg) throws IllegalArgumentException{
		throw new IllegalArgumentException(msg);
	}
}
