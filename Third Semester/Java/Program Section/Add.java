// add two user inputed numbers
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a, b, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        s = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + s);

    }
}