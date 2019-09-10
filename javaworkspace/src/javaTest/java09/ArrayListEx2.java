package javaTest.java09;
import java.util.*; 
class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	//지역변수에는 파이널만 붙을 수있다. 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); //.랭스는 몇글자가 있는지 
		List list = new ArrayList(length/LIMIT + 10); //다형성형태로 어레이리스트가 리스트에있는걸 오버라이딩하는ㄱ ㅓㅅ 
		for(int i=0; i < length; i+=LIMIT) { //크기만큼 반복을 한다. 1씩이아니라 리밋만큼이라 10씩 증가 
			if(i+LIMIT < length ) // I+리밋 = 10  
				list.add(source.substring(i, i+LIMIT)); //0-9까지 자른다. 마지막은 포함안댬 
			else 
				list.add(source.substring(i)); //남아있는 부분은 몽땅다
		} 

		for(int i=0; i < list.size(); i++) { //사이즈만큼 반복하고
			System.out.println(list.get(i)); //꺼낸다
		} 
	} // main()
} 

//스트링을 이용해서 10개씩 끊어서 한다. 