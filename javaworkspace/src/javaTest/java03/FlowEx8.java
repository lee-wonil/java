package javaTest.java03;
class  FlowEx8{
	public static void main(String[] args) {
		int score = 3;
		String msg = "";
		score *= 100;
		msg = "����� ������"+score+"�̸� ��ǰ��-";
		switch(score){
			case 100 :
				msg += "����,";
			case 200 :
				msg += "TV,";
			case 300 :
				msg += "������,";
			case 400 :
				msg += "��Ʈ��,";
			break;
			default :
				msg += "��";
		}
		System.out.println(msg+"�Դϴ�");
	}
}
