import java.net.InetAddress;

public class HashGenerator {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("192.32.32.4");
			int hash = add.hashCode();
			System.out.println("Hash code = " + hash);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}