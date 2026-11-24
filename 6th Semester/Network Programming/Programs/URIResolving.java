import java.net.URI;
import java.net.URISyntaxException;

public class URIResolving {
	public static void main(String[] args){
try{
	URI baseUri  = new URI("https://www.example.com/");
	URI relativeUri = new URI("resoure.html");

	URI resolvedUri = baseUri.resolve(relativeUri);
	System.out.println("Full uri : " + resolvedUri );
} catch(URISyntaxException e){
	System.out.println(e);
}
	}
}
