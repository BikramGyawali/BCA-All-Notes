public class OddUsingConstructor {
    int x;

    public OddUsingConstructor(int y) {
        x = y;
        if (x % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("the number is odd");
    }

    public static void main(String[] args) {
        OddUsingConstructor pcm = new OddUsingConstructor(21);

    }
}
