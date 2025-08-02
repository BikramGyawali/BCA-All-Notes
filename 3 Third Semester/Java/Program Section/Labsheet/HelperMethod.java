class example {
    public void mainmethod() {
        //
        // int result = addition();
        // System.out.println("This is method for addition" + result);
        System.out.println("This is method for addition");
        addition();
    }

    private void addition() {
        int a = 10, b = 20;
        // return a + b;

        int c = a + b;
        System.out.println(c);

    }
}

public class HelperMethod {

    public static void main(String[] args) {
        example m = new example();
        m.mainmethod();
        // m.addition(); // i cannt use it because i make addition private

    }
}
