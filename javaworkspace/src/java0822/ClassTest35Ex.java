package java0822;
import java.util.Scanner;



/*
	Grade Ŭ������ �ۼ��غ�����. 
	3������ ������ �Է¹޾� Grade ��ü�� �����ϰ� ���� ����� ����ϴ� main()�� ���� ���ô� �Ʒ��� �����ϴ�. 
	�ܼ���¿� )
		����, ����, ���������� �Է��ϼ���. 
		����>> 90  (<- ���Ƿ� ����ڰ� �Է��� ����)
		����>> 88
		����>> 96
		����� 91
*/
class Grade{
	private int math;
	private int sci;
	private int eng;
	Grade(int math,int sci,int eng){
		this.math=math;
		this.sci=sci;
		this.eng=eng;
	}	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getAvg() {
		return (math+sci+eng)/3;
	}
	
}


public class ClassTest35Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���.");
		System.out.print("����>>");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("����>>");
		int sci = Integer.parseInt(sc.nextLine());
		System.out.print("����>>");
		int eng = Integer.parseInt(sc.nextLine());
		Grade me = new Grade(math, sci, eng);
		System.out.println("����� "+ me.getAvg());
		
		sc.close();
		
	}

}
