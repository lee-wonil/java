package java0902;

public class StringEx05 {
	public static void main(String[] args) {
		
		String fileName = "Hello.com.java";
		int index = fileName.indexOf('.');
		//System.out.println(index);
		String name = fileName.substring(0,index);
		String ext = fileName.substring(index);
		System.out.println(fileName+"의 확장자를 제외한 이름은 "+name);
		System.out.println(fileName+"의 확장자는 "+ext);
	
		int lastIdx = fileName.lastIndexOf('.');
		System.out.println(lastIdx);
		
	}
}
