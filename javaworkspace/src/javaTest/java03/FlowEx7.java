package javaTest.java03;
class  FlowEx7{
	public static void main(String[] args) {
		char ch = 'A';
		int i = 0;
		switch(ch){
			case 'A' :
				i= 90;
			break;
			case 'B' :
				i=80;
			break;
			case 'C' :
				i=70;	
			break;
			case 'D' :
				i=60;		
			break;
			default :
				i=50;
		}
		System.out.println("����� ������ "+i+"���� �Դϴ�.");
	}
}