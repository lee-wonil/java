package java0906;

import java.net.URL;
import java.util.Scanner;

public class URLEx01 {
	
	public static void main(String[] args) throws Exception {
		
		String urls = null;
		Scanner sc = new Scanner(System.in);
		urls = sc.nextLine();
		
		URL url = new URL(urls);
		
		System.out.println("프로토콜: "+url.getProtocol());
		System.out.println("포트번호: "+url.getPort());
		System.out.println("호스트: "+url.getHost());
		System.out.println("url 내용: "+url.getContent());
		System.out.println("파일경로 : "+url.getFile());
		System.out.println("URL 전체: "+url.toExternalForm());
	}
}
