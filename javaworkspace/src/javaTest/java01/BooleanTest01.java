package javaTest.java01;
class  BooleanTest01 {
	public static void main(String args[]) {
		int currentPage = 1;
		int startPage = (int)(currentPage/10)*10+1;
		int endPage = currentPage * 10;
		System.out.println(startPage > 0); // startPage가 0보다 크면 true 출력 startPage가 0보다 작으면 false 출력
		System.out.println(endPage > startPage); // endPage가 startPage보다 크면 true 출력 작으면 false 출력
	}
}