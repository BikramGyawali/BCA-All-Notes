import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

    public static void main(String[] args) {
        File f = new File("file.txt");
        try (
                FileWriter fw = new FileWriter("file1.txt");
                Scanner s = new Scanner(f)) {
            StringBuilder sb = new StringBuilder();
            while (s.hasNextLine()) {
                String line = s.nextLine();
                sb.append(line).append("\n");
            }

            fw.write(sb.toString());
            // No need to close fw or s explicitly due to try-with-resources
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("File copied successfully");
    }
}
