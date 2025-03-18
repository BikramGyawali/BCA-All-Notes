import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        try {

            float c = (float) a / b;
            System.out.println("The result is " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
