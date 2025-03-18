class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 40;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass ou = new OuterClass();
        OuterClass.InnerClass in = ou.new InnerClass();
        System.out.println("The sum is " + (ou.x + in.y));
    }
}
