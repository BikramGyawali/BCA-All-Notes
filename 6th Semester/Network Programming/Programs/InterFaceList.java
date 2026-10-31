import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InterFaceList {
	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();
			while (ni.hasMoreElements()) {
				NetworkInterface intf = ni.nextElement();
				System.out.println(intf);
			}
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
}
