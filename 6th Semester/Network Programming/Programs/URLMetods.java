import java.net.URL;
import java.net.MalformedURLException;

public class URLMetods {
	public static void main(String[] args) {

		try {
			URL myUrl = new URL("https://www.example.com/hello.html");
			// getProtocol()
			String protocol = myUrl.getProtocol();
			System.out.println("Protocol used  " + protocol);
			// getPort()
			int port = myUrl.getPort();
			System.out.println("Port of url " + port);
			String host = myUrl.getHost();
			System.out.println("Host of url " + host);
			String file = myUrl.getFile();
			System.out.println("File of url " + file);

		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}
}