import java.net.InetAddress;

public class Reachability {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("www.google.com");
			System.out.println("Check for 20 ms" + add.isReachable(200));
			System.out.println("Check for 30 ms " + add.isReachable(300));
		} catch (Exception e) {
			System.out.println("Cannot reach the node ");
		}
	}
}