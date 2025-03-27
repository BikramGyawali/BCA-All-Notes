public class Throw {
    static void check(int a, int b) {
        int c = a / b;
        if (c < 0) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        check(10, 5);
    }
}
