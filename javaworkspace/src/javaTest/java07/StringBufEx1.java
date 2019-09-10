package javaTest.java07;
class StringBufEx1{
	public static void main(String[] args){
		int var = 0;
		StringBuffer sb = new StringBuffer("sun");
		var = sb.capacity();
		System.out.println("capacity : "+var);
		 
		var = sb.length();
		System.out.println("length : "+var);
	}
}