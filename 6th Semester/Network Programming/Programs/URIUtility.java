import java.net.URI;
import java.net.URISyntaxException;

public class URIUtility {
	public static void main(String[] args) {
		try {
			URI uri1 = new URI("https://www.example.com/");
			URI uri2 = new URI("https://www.example.com/");

			Boolean isEqual = uri1.equals(uri2);
			System.out.println("For Equal : " + isEqual);

			int hash = uri1.hashCode();
			System.out.println("Hash code : " + hash);

			String uriString = uri2.toString();
			System.out.println("String of uri2 : " + uriString);

			String asciString = uri1.toASCIIString();
			System.out.println("ASCI Strinng  " + asciString);
		} catch (URISyntaxException e) {
			System.out.println(e.getMessage());
		}
	}
}
