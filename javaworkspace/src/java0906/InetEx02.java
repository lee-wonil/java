package java0906;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetEx02 {

	public static void main(String[] args) throws Exception {
		String url = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("웹사이트 주소 입력>>");
		url = sc.nextLine();
		
		//InetAddress addr = InetAddress.getByName(url);
		InetAddress[] addr = InetAddress.getAllByName(url);
		System.out.println("==========================");
		System.out.println(url+"은 "+addr.length+"개의 ip주소를 가지고 있다.");
		for(int i = 0; i<addr.length;i++) {
			System.out.println("IP 번호 = "+addr[i].getHostAddress());
		}
	}

}
