
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = 0;
        System.out.println("Enter  a number");
        int n = s.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f++;
                break;
            }

        }

        if (f == 0) {
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }
    }
}
