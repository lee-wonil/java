package javaTest.java07;
class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");	
		String str2 = new String("abc");
		if(str1 == str2){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		if(str1.equals(str2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}


//���ͷ��̶� ������ ����ü�� ���ͷ��̶� �Ѵ�.