import java.util.Scanner;

interface add {
    public void addition(int x, int y);
}

class newAdd implements add {
    public void addition(int x, int y) {
        System.out.println("The sum is " + (x + y));
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        newAdd obj = new newAdd();
        obj.addition(a, b);
    }
}
