package javaTest.java11;
import java.net.InetAddress;
import java.net.UnknownHostException ;
class  InetEx1{
	public static void main(String[] args)throws UnknownHostException {
		InetAddress addr = InetAddress.getByName("nas.soldesk.com");
		System.out.println(addr.getHostAddress ());
		System.out.println(addr.getHostName());
	}
}
