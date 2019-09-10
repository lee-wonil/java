package java0902;

public class WrapperEx04 {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'f';
		if(Character.isDigit(c1))System.out.println(c1+"Àº ¼ýÀÚ");
		if(Character.isAlphabetic(c2))System.out.println(c2+"Àº ¾ËÆÄºª");
		
		//¹Ú½Ì ¾ð¹Ú½Ì
		int n = 10;
		Integer intObj = n;				//¹Ú½Ì(±âº»Çü-> °´Ã¼Çü)
		System.out.println(intObj);
		
		int m = intObj+10;				// ¾ð¹Ú½Ì(°´Ã¼Çü -> ±âº»Çü)
		System.out.println(m);
	}
}
