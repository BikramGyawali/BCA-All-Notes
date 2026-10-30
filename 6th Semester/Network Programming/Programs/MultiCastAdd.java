import java.net.InetAddress;

public class MultiCastAdd {
	public static void main(String[] args) {
		try {
			InetAddress add4 = InetAddress.getByName("224.1.2.1");
			InetAddress add6 = InetAddress.getByName("FF00:2222:2223::2");
			InetAddress addF = InetAddress.getByName("Fe04:3232:4532::3");

			System.out.println("Checking multcast address");

			System.out.println("for ipv4 " + add4.isMulticastAddress());
			System.out.println("for ipv6 " + add6.isMulticastAddress());
			System.out.println("for ipv6 for false case : " + addF.isMulticastAddress());

		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
}
