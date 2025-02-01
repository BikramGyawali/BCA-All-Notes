// Program to find the greatest number among three numbers
public class Greatest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > c && b > a) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }

    }
}