package javaTest.java03;
class IfEx2 {
	public static void main(String[] args) {
		int su1 = Integer.parseInt(args[0]); // Scanner�� ��ä�ϱ�
		String str;

		if(su1 >= 50)
			str = "50�̻�"; 
		else
			str = "50�̸�";
		System.out.println(str+"�Դϴ�.");
	}
}