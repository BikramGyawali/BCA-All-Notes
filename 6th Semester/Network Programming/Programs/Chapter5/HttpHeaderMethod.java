import java.net.URLConnection;
import java.io.IOException;
import java.net.URL;
public class HttpHeaderMethod {
	public static void main(String[] args){
		try{
			URL url = new URL("http://www.google.com");
			URLConnection conn = url.openConnection();

			System.out.println(conn.getContentType());
			System.out.println(conn.getContentLength());
			System.out.println(conn.getDate());
			System.out.println(conn.getExpiration());
			System.out.println(conn.getLastModified());
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
