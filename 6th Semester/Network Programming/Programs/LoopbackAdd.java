import java.net.InetAddress;
import java.net.UnknownHostException;

public class LoopbackAdd {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("127.0.0.1"); // for ipv4
			InetAddress add6 = InetAddress.getByName("::1"); // for ipv6

			System.out.println("Checking for loopback adress ");
			System.out.println("for ipv4 " + add.isLoopbackAddress());
			System.out.println("for Ipv6 " + add6.isLoopbackAddress());
		} catch (UnknownHostException e) {
			System.out.println("error" + e);
		}

	}
}
