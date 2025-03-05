public class ReturnValue {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnValue rv = new ReturnValue();
        // rv.sum(4, 5);
        System.out.println(rv.sum(4, 5));
    }
}
