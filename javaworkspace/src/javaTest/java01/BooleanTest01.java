package javaTest.java01;
class  BooleanTest01 {
	public static void main(String args[]) {
		int currentPage = 1;
		int startPage = (int)(currentPage/10)*10+1;
		int endPage = currentPage * 10;
		System.out.println(startPage > 0); // startPage�� 0���� ũ�� true ��� startPage�� 0���� ������ false ���
		System.out.println(endPage > startPage); // endPage�� startPage���� ũ�� true ��� ������ false ���
	}
}