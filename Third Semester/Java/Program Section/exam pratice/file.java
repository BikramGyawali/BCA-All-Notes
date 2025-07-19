import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {

        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("file is already created");
            }
        } catch (Exception e) {
            System.out.println("Not created");
        }

        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("We are from the coding journey");
            fw.close();
            System.out.println("File is written successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File f = new File("file.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not exist");
        }

        // file info

        File f1 = new File("file.txt");
        if (f1.exists()) {
            System.out.println("name" + f1.getName());
            System.out.println("Path" + f1.getAbsolutePath());
            System.out.println("Size : " + f1.length());
        }

        // file delte

        File f2 = new File("file.txt");
        if (f2.delete()) {
            System.out.println("Delete file" + f2.getName());

        } else {
            System.out.println("File is not deleted");
        }
    }
}
