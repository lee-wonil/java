package javaTest.java03;
class  FlowEx9{
	public static void main(String[] args) {
		int score = 88;
		char grade = ' ';
		switch(score){
			case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : 
			case 94 : case 93 : case 92 : case 91 :
			case 90 :
				grade = 'A';
			break;
			case 89: case 88: case 87: case 86 : case 85 :
			case 84 : case 83 : case 82 : case 81: 
			case  80 :
				grade = 'B';
			break;
			default :
				grade = 'F';
		}
		System.out.println("����� ������ "+grade+" �Դϴ�.");
	}
}
/*
	FlowEx3 �� if ������ switch ���� �̿��ؼ� �����Ѱ��̴�. 
	�� ������ if ���� �̿��ؼ� �����Ϸ��� ���ǽ��� 4���� �ʿ��ϴ�.
	�ݸ� switch ���� �̿��ϸ� ���ǽ� 1���̸� �ǹǷ� �� ������ 
	�׷��� case���� �ʹ� �������Ƿ� ���� ���� �ڵ尡 �ȴ�. 

	�ݵ�� �ӵ��� �����Ѿ��Ѵٸ� if ������ switch ���� ������ 
	�׷��� �ʴ���� �̷���� if ���� �� �����ϴ�..
*/