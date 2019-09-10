package java0821;

class MemberCall {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
//	static int cv2 = iv;		// ����. Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv;	 // ��ó�� ��ü�� �����ؾ� ��밡��.

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // ����. Ŭ�����޼��忡�� �ν��Ͻ������� ���Ұ�.
		MemberCall c = new MemberCall();	
		System.out.println(c.iv);   // ��ü�� ������ �Ŀ��� �ν��Ͻ������� ��������.
	}

	void instanceMethod1() {
		System.out.println(cv);		
		System.out.println(iv); // �ν��Ͻ��޼��忡���� �ν��Ͻ������� �ٷ� ��밡��.
	}

	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // ����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� ����.
 	}
	
	void instanceMethod2() {	// �ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼���
		staticMethod1();		//  ��� �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�.
		instanceMethod1();
	}


 public static void main(String [] args){
      System.out.println("=======1111=======");
      MemberCall.staticMethod1();
      System.out.println("=======2222=======");
	  MemberCall.staticMethod2();
	  MemberCall mc = new MemberCall();
	  System.out.println("=======3333=======");
	  mc.instanceMethod1();
	  System.out.println("=======4444=======");
	  mc.instanceMethod2();

 }
}