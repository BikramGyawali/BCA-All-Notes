import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterfaceEx {
	public static void main(String[] args) {
		try {
			NetworkInterface ni = NetworkInterface.getByName("ethernet_4232");
			if (ni == null) {
				System.err.println("No Such interface");
			}
			System.out.println("Network Interface Name " + ni.getDisplayName());
			System.out.println("Ethernet name  " + ni.getName());
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
}
