public class HelperMethod {
    public void mainmethod() {
        // int result = addition();
        // System.out.println("This is method for addition" + result);
        System.out.println("This is method for addition");
    }

    public void addition() {
        int a = 10, b = 20;
        // return a + b;

        int c = a + b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        HelperMethod h = new HelperMethod();
        h.mainmethod();
        h.addition();
    }
}
