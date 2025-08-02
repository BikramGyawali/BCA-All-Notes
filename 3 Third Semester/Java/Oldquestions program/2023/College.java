import java.util.Scanner;

public class College {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter  the name of College:");
        String name = s.nextLine();
        if (name.length() > 50) {
            throw new Exception("Name of college should not be more than 50 characters");
        }

    }
}
