public class Usingthis {
    int y;

    public Usingthis(int x) {
        this.y = x;
    }

    public static void main(String[] args) {
        Usingthis obj = new Usingthis(10);
        System.out.println("The value of x is " + obj.y);
    }
}