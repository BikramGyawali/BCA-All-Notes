import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamChecker {
	public static final String spamChk = "sbl.spamhaus.org";

	public static void main(String[] args) {
		if (isSpammer("203.0.113.0")) {
			System.out.println("Known Spammer");
		} else {
			System.out.println("Not a Spammer");
		}
	}

	public static boolean isSpammer(String ipAddress) {
		try {
			InetAddress add = InetAddress.getByName(ipAddress);
			byte[] quad = add.getAddress();
			String query = spamChk;

			for (byte octet : quad) {
				int unsignedByte = octet < 0 ? octet + 256 : octet;
				query = unsignedByte + "." + query;
			}
			InetAddress.getByName(query);
			return true;
		} catch (UnknownHostException e) {
			return false;
		}
	}
}
