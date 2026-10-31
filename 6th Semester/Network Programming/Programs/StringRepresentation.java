import java.net.InetAddress;
import java.net.UnknownHostException;

public class StringRepresentation {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("192.168.1.1");
			String stringRep = add.toString();
			System.out.println("String Representation = " + stringRep);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}
