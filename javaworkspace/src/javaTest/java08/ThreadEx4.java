package javaTest.java08;
 class ThreadEx4 {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("�ҿ�ð�1:" +(System.currentTimeMillis()- startTime)); 

		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}

		System.out.print("�ҿ�ð�2:"+(System.currentTimeMillis() - startTime));
	}
}