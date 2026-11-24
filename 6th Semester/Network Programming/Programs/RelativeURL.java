import java.net.URL;
import java.net.MalformedURLException;

public class RelativeURL {
	public static void main(String[] args) throws MalformedURLException {
		URL myUrl = new URL("https://www.example.com/");
		URL rUrl1 = new URL(myUrl, "index.html");
		URL rUrl2 = new URL(myUrl, "about.html");

		System.out.println("url 1  : " + rUrl1);
		System.out.println("url 2  :" + rUrl2);
	}
}
