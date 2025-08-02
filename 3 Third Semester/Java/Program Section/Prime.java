// find the number is prime or not 

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, i, f = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                f++;
                break;
            }
        }

        if (f == 0)
            System.out.println("" + n + " is a prime number");
        else
            System.out.println("" + n + " is not a prime number");

    }
}