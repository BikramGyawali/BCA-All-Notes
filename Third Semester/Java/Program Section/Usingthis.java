public class Usingthis {
    int x;

    public Usingthis(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Usingthis obj = new Usingthis(10);
        System.out.println("The value of x is " + obj.x);
    }
}