// java book page nuber 144 6.12 question

import java.util.Scanner;

public class NetAmount {
    public static void main(String[] args) {
        int choice;
        float na = 0, d, a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Mill Colth and 2 for Handloom items");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter amount of money will use for shopping");
                a = sc.nextFloat();
                if (a > 0 && a <= 100) {

                    System.out.println("You need to pay  rs" + a);

                } else if (a > 100 && a <= 200) {
                    d = a * 5.0f / 100; // using .0f because the amount is in float.
                    na = a - d;
                    System.out.println("You need to pay  rs" + na);

                } else if (a > 200 && a <= 300) {
                    d = a * (7.0f / 100);
                    na = a - d;

                    System.out.println("You need to pay  rs" + na);

                } else {
                    d = a * (10.0f / 100);
                    na = a - d;
                    System.out.println("You need to pay  rs" + na);

                }
                break;

            case 2:
                System.out.println("Enter amount of money will use for shopping");
                a = sc.nextFloat();
                if (a > 0 && a <= 100) {
                    d = a * (5.0f / 100);
                    na = a - d;
                    System.out.println("You need to pay  rs" + na);

                } else if (a > 100 && a <= 200) {
                    d = a * (7.0f / 100);
                    na = a - d;

                    System.out.println("You need to pay  rs" + na);

                } else if (a > 200 && a <= 300) {
                    d = a * (10.0f / 100);
                    na = a - d;
                    System.out.println("You need to pay  rs" + na);

                } else {
                    d = a * (15.0f / 100);
                    na = a - d;
                    System.out.println("You need to pay  rs" + na);

                }
                break;
            default:
                System.out.println("Enter the valid choice");
                break;

        }

    }
}
