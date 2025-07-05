import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createFile {
    public static void main(String[] args) {

        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("File is Created");

            } else {
                System.out.println("File is already exist");
            }
        } catch (Exception e) {
            System.out.println("File is not created");
        }

        // writing to file

        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("We are from Coding Journey");
            fw.close();
            System.out.println("File is written successfully");

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        // for reading file

        try {
            File f = new File("file.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error in file");
        }
        // for file info
        File f1 = new File("file.txt");
        if (f1.exists()) {
            System.out.println("File name :" + f1.getName());
            System.out.println("File path:" + f1.getAbsolutePath());
            System.out.println("File size in byte:" + f1.length());

        }
        // for delete
        File f2 = new File("file.txt");
        if (f2.delete()) {
            System.out.println("File is deletd of name " + f2.getName());
        } else {

            System.out.println("File is not deleted");
        }
    }

}
