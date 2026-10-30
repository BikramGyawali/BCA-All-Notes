import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpPrint {

	public static void main(String args[]) {

		try {
			InetAddress add = InetAddress.getByName("192.168.2.3");
			// InetAddress add = InetAddress.getByName("www.google.com"); using website name
			
			System.out.println("Name : " + add.getByName(null));
			System.out.println("Ip adress : " + add.getAddress());
			System.out.println("Host Name: " + add.getHostName());
			System.out.println("Canonical Host " + add.getCanonicalHostName());
		} catch (UnknownHostException e) {
			System.out.println("Host not found");
		}
	}
}