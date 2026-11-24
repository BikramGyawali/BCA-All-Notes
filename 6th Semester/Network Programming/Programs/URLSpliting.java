import java.net.URL;
import java.net.MalformedURLException;

public class URLSpliting {
	public static void main(String[] args) {
		try {
			String urlString = "http://www.ibiblio.org/javafaq/books/jnp/index-network-dev-java-programming-language.html.gz?=1565922069#toc";
			URL myUrl = new URL(urlString);

			String protocol = myUrl.getProtocol();
			String authority = myUrl.getAuthority();
			String host = myUrl.getHost();
			int port = myUrl.getPort(); // -1 if not specified;
			String fragment = myUrl.getRef();
			String query = myUrl.getQuery();
			String userInfo = myUrl.getUserInfo();
			String path = myUrl.getPath();
			// print

			System.out.println("Protocol : " + protocol);
			System.out.println("Path :" + path);
			System.out.println("Host : " + host);
			System.out.println("Fragement : " + fragment);
			System.out.println("Port : " + (port == -1 ? "Not Specified" : port));
			System.out.println("User Information : " + userInfo);
			System.out.println("Query : " + query);
			System.out.println("Authority : " + authority);
		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}
}
