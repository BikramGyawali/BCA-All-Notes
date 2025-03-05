public class Scope {

    public static void main(String[] args) {
        int a = 10; // method scope
        System.out.println(a);
        { // use curcly braces for block scope
            int b = 20;
            System.out.println("The value of a can only use in this bracket so it is block scope " + b);
        }
    }
}
