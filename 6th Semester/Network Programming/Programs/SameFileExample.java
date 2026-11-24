import java.net.MalformedURLException;
import java.net.URL;

public class SameFileExample {
	public static void main(String[] args) {
		try {
			URL u1 = new URL("https://www.example.com/about.html#home");
			URL u2 = new URL("https://www.example.com/about.html#about");

			if (u1.sameFile(u2)) {
				System.out.println(u1 + " is the same file " + u2);
			} else {
				System.out.println("is not same file");
			}
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
