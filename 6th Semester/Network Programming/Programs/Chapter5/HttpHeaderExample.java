import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpHeaderExample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.example.com");
			URLConnection conn = url.openConnection();
			Map<String, List<String>> headerFields = conn.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
				String headerName = entry.getKey();
				List<String> headerValues = entry.getValue();
				System.out.println(headerName + ":" + String.join(",", headerValues));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
