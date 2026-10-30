import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostAddress {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getLocalHost();

			String hostAdd = add.getHostAddress();
			System.out.println("Local Host Address " + hostAdd);
			// for ip address
			byte[] ipAdd = add.getAddress();
			System.out.println("IP Address" + ipAdd);
		} catch (UnknownHostException e) {
			System.out.println("Coludnot find the host address " + e);
		}
	}
}
