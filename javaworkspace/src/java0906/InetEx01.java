package java0906;

import java.net.InetAddress;

public class InetEx01 {

	public static void main(String[] args) throws Exception{
		InetAddress addr1 = InetAddress.getByName("naver.com");
		System.out.println("addr1 : " + addr1);
		InetAddress addr2 = InetAddress.getByName("59.5.12.241");
		System.out.println("addr2 : " + addr2.getHostName());
		// ���� ip�ּ�
		InetAddress addr3 = InetAddress.getLocalHost();
		System.out.println("���� �ּ�=  " + addr3.getHostAddress());
		System.out.println("���� �̸�=  " + addr3.getHostName());
	}

}
