package java0906;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetEx02 {

	public static void main(String[] args) throws Exception {
		String url = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ʈ �ּ� �Է�>>");
		url = sc.nextLine();
		
		//InetAddress addr = InetAddress.getByName(url);
		InetAddress[] addr = InetAddress.getAllByName(url);
		System.out.println("==========================");
		System.out.println(url+"�� "+addr.length+"���� ip�ּҸ� ������ �ִ�.");
		for(int i = 0; i<addr.length;i++) {
			System.out.println("IP ��ȣ = "+addr[i].getHostAddress());
		}
	}

}
