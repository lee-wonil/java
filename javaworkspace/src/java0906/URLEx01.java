package java0906;

import java.net.URL;
import java.util.Scanner;

public class URLEx01 {
	
	public static void main(String[] args) throws Exception {
		
		String urls = null;
		Scanner sc = new Scanner(System.in);
		urls = sc.nextLine();
		
		URL url = new URL(urls);
		
		System.out.println("��������: "+url.getProtocol());
		System.out.println("��Ʈ��ȣ: "+url.getPort());
		System.out.println("ȣ��Ʈ: "+url.getHost());
		System.out.println("url ����: "+url.getContent());
		System.out.println("���ϰ�� : "+url.getFile());
		System.out.println("URL ��ü: "+url.toExternalForm());
	}
}
