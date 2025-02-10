
public class Constructor {
    int x;
    String name;

    public Constructor(int y, String myName) {
        x = y;
        name = myName;

    }

    public static void main(String[] args) {
        Constructor cons = new Constructor(5, "Bikram");
        System.out.println(cons.x);
        System.out.println(cons.name);

    }
}