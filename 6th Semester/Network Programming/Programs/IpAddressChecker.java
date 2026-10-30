import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressChecker {
	public static void main(String[] args) {
		String ipv4 = "192.168.2.3";
		String ipv6 = "2001:3003:2232::4342";
		System.out.println(ipv4 + "is Address type" + getIpCheckerFun(ipv4));
		System.out.println(ipv6 + "is Address type" + getIpCheckerFun(ipv6));
	}

	public static String getIpCheckerFun(String ipAdd) {
		try {
			InetAddress add = InetAddress.getByName(ipAdd);
			byte[] addByte = add.getAddress();
			if (addByte.length == 4)
				return "Ipv4";
			else if (addByte.length == 16)
				return "Ipv6";
			else
				return "Unknown ip format";
		} catch (UnknownHostException e) {
			return "Invalid ip";
		}
	}

}