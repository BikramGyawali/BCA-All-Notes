public class HelperMethod {
    public void mainmethod() {
        int result = addition();
        System.out.println("This is method for addition" + result);
    }

    public int addition() {
        int a = 10, b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        HelperMethod h = new HelperMethod();
        h.mainmethod();
    }
}
