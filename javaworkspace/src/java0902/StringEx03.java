package java0902;

public class StringEx03 {
	public static void main(String[] args) {
		String a = new String("C#");
		String b = new String(", C++");
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));
		
		//replace
		String str = "Apple Tree";
		String res = str.replace("Apple", "remon");
		System.out.println(res);
		
		a=a.concat(b);
		System.out.println(a);
		String []result = a.split(",");
		for(String r : result) {
			System.out.println(r);
		}
		System.out.println(str.substring(3));
	}
}
