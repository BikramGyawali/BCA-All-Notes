public class Throw {
    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        check(19);
    }
}
