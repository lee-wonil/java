package javaTest.java07;
import java.util.*;

class WrapperEx2 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(4);

		v.add(new Integer(1));
		v.add(new Integer(3));
		v.add(new Integer(11));
		v.add(new Integer(2));
		for(int i = 0; i < v.size(); i++){
			System.out.println(v.elementAt(i));
		}

		Collections.sort(v);	//Vector ����� ���� �����Ѵ�.
		System.out.println("=���� ��=");

		for(int i = 0; i < v.size(); i++){
			System.out.println(v.elementAt(i));
		}
	}
}
