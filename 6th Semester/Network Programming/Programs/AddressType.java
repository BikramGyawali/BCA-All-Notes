import java.net.InetAddress;

public class AddressType {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("0.0.0.0");
			System.out.println("checking the address is wild card or not \n" + add.isAnyLocalAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
