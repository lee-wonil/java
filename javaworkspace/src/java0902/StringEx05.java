package java0902;

public class StringEx05 {
	public static void main(String[] args) {
		
		String fileName = "Hello.com.java";
		int index = fileName.indexOf('.');
		//System.out.println(index);
		String name = fileName.substring(0,index);
		String ext = fileName.substring(index);
		System.out.println(fileName+"�� Ȯ���ڸ� ������ �̸��� "+name);
		System.out.println(fileName+"�� Ȯ���ڴ� "+ext);
	
		int lastIdx = fileName.lastIndexOf('.');
		System.out.println(lastIdx);
		
	}
}
