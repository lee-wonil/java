package javaTest.java07;
class StringEx1_1{
	public static void main(String[] args) {
		String str = args[0];
		for(int i = str.length() ; i > 0 ; i--){
			System.out.print(str.charAt(i-1));
		}
		System.out.println();
		System.out.println();
		
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		System.out.println(sb);

	}

}
