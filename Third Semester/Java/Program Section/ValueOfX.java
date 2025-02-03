// java book page nuber 144 6.13 question

import java.util.Scanner;

public class ValueOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        // using nested if Statement

        // if (x > 0) {
        // System.out.println(" y is 1");

        // }
        // if (x == 0) {
        // System.out.println(" y is 0");

        // }
        // if (x < 0) {
        // System.out.println(" y is -1");

        // }

        // Using else if Statment

        // if (x > 0) {
        // System.out.println(" y is 1");

        // } else if (x == 0) {
        // System.out.println(" y is 0");

        // } else {
        // System.out.println(" y is -1");

        // }

        // Using Ternary operator

        int y = (x != 0) ? ((x > 1) ? 1 : -1) : 0;
        System.out.println("Y is " + y);

    }
}