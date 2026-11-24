import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingURL {
	public static void main(String[] args) {
		try {
			URL myUrl = new URL("https://www.google.com");
			InputStream inputStream = myUrl.openStream();
			/*
			 * create BufferedReader to read the character from the input stream
			 * InputStreamReader Convert bytes form InputStream into charcter
			 * BufferedReader reader charcter from inputStream and store them in interna
			 * buffer
			 * to make reading effecticient.
			 */
			BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));

			String line = bReader.readLine();
			while (line != null) {
				System.out.println(line);
			}
			bReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}