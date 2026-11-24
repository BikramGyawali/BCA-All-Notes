import java.net.URI;
import java.net.URISyntaxException;

public class URIExample {
	public static void main(String[] args) {
		try {
			URI uri = new URI("https://www.example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING");
			// except port number all other uses the string as return type port number
			// returns int type

			System.out.println("Scheme:" + uri.getScheme());
			System.out.println("Authority : " + uri.getAuthority());
			System.out.println("Host : " + uri.getHost());
			System.out.println("Port : " + uri.getPort());
			System.out.println("Path:" + uri.getPath());
			System.out.println("Query : " + uri.getQuery());
			System.out.println("Fragment : " + uri.getFragment());

		} catch (URISyntaxException e) {
			System.out.println(e);
		}
	}
}
