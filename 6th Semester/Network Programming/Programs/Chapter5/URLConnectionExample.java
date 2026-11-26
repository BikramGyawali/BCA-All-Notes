
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class URLConnectionExample {f
	public static void main(String[] args) {
		try{
			URL url = new URL("http://www.example.com");
		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		int c;
		while ((c = inputStream.read()) != -1) {
			System.out.print((char) c);
		}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}