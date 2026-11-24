import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoding {
	public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
		String baseUrl = "https://www.google.com/?q=";
		String query = "info@gmil for bca";
		System.out.println("URL without encoding");
		URL url = new URL(baseUrl + query);
		System.out.println(url);

		System.out.println("URL after Encoding");
		url = new URL(baseUrl + URLEncoder.encode(query, "UTF-8"));
		System.out.println(url);

		System.out.println("Decoding the encoded url");
		String decodeUrl = URLDecoder.decode("https://www.google.com/?q=info%40gmil+for+bca", "UTF-8");
		System.out.println(decodeUrl);
	}
}
