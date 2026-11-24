import java.net.MalformedURLException;
import java.net.URL;

public class ExternalFormExample {
	public static void main(String[] args) {
		try {
			URL u1 = new URL("https://www.example.com");
			String result = u1.toExternalForm();
			System.out.println("String representation of 	URL is: " + result);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
