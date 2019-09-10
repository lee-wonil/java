package javaTest.java07;
class StringEx51{
	public static void main(String[] args){
		String s1 = "Wonnder Girls";

		String[] arr = s1.split(" ");
		for(int i = 0 ; i < arr.length ; i++)
			System.out.println("arr["+i+"] : "+arr[i]);
	}
}