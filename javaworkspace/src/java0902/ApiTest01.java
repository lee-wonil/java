package java0902;	// ��Ű�� ����

class AClass{
	
}

public class ApiTest01 {
	public static void main(String[] args) {
		AClass obj = new AClass();
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
}
