// java book page nuber 144 6.9 question

import java.util.Scanner;

public class Candidate {
    public static void main(String[] args) {
        int m, p, c, t = 0, mp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics :");
        p = sc.nextInt();
        System.out.println("Enter the marks of Math :");
        m = sc.nextInt();
        System.out.println("Enter the marks of Chemistry :");
        c = sc.nextInt();
        t = p + m + c;
        mp = m + p;
        if (m >= 60 && p >= 60 && c >= 60 && t >= 200 || mp >= 150)
            System.out.println("You are Eligible");
        else
            System.out.println("You are not Eligible");
    }
}