import java.net.InetAddress;

public class EqualityChecker {
	public static void main(String[] args) {
		try {
			InetAddress add1 = InetAddress.getByName("192.168.9.1");
			InetAddress add2 = InetAddress.getByName("192.188.9.1");
			boolean result = add1.equals(add2);
			System.out.println("Result for eqality " + result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
