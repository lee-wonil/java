package javaTest.java02;
class OperEx8{
	public static void main(String[] args){
		int a = 14;
		int b = 16;
		String c = "";
		String s = "크다 ";
		s += ++a >= b ? a == b?"가 아니라 같네": (a-b)+"만큼 a가.." : (b-a)+"만큼 b가..";
		System.out.println(s);
	}
}